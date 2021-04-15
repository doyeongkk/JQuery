package kr.or.ddit.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.MemberVO;

/**
 * Servlet implementation class Memberjoin
 */
@WebServlet("/join.do")
public class Memberjoin extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Memberjoin() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		
		// 0. 클라이언트 요청시 전송되는 데이터를 받는다. 
		String id = request.getParameter("mem_id");
		String name = request.getParameter("mem_id");
		String pass = request.getParameter("mem_pass");
		String bir = request.getParameter("mem_bir");
		String zip = request.getParameter("mem_zip");
		String add1 = request.getParameter("mem_add1");
		String add2  = request.getParameter("mem_add2");
		String hp  = request.getParameter("mem_hp");
		String mail  = request.getParameter("mem_mail");
		
		MemberVO vo = new MemberVO();
		vo.setMem_id(id);
		vo.setMem_name(name);
		vo.setMem_pass(pass);
		vo.setMem_bir(bir);
		vo.setMem_zip(zip);
		vo.setMem_add1(add1);
		vo.setMem_add2(add2);
		vo.setMem_hp(hp);
		vo.setMem_mail(mail);
		
		//1. service 객체 얻어 오기 
		IMemberService service = MemberServiceImpl.getService();
		
		//2. service 메서드 호출 하기  - 결과를 받는다
		String resId = service.insertMember(vo);
				
		//3. request객체에 결과를 저장한다. 
		request.setAttribute("resId", resId);
		        
		//4. 결과로 출력 하거나 json데이터 생성 - jsp 응답 페이지
		    request.getRequestDispatcher("1130/joinres.jsp").forward(request, response);
		
		
				
		
		
		
	}

}
