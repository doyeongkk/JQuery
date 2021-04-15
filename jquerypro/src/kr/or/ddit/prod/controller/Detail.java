package kr.or.ddit.prod.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.prod.service.IProdService;
import kr.or.ddit.prod.service.ProdServiceImpl;
import kr.or.ddit.prod.vo.ProdVO;

@WebServlet("/detail.do")
public class Detail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. service객체 얻어오기
		IProdService service = ProdServiceImpl.getService();
		// 2. service메소드 호출 - 결과를 받는다.
		String name = request.getParameter("name");
		ProdVO vo = service.getDetail(name);
		// 3. request객체에 결과를 저장한다.
		request.setAttribute("vo", vo);
		// 4. 결과로 출력하거나 json데이터 생성 - jsp 응답 페이지에서
		// jsp페이지로 forword
		RequestDispatcher disp = request.getRequestDispatcher("1130/prod_detail.jsp");
		disp.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}