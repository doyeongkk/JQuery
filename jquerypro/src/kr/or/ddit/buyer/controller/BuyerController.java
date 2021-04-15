package kr.or.ddit.buyer.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.buyer.service.BuyerServiceImpl;
import kr.or.ddit.buyer.service.iBuyerService;
import kr.or.ddit.buyer.vo.BuyerVO;
import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.MemberVO;

/**
 * Servlet implementation class BuyerController
 */
@WebServlet("/Buyer.do")
public class BuyerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 전체 이름 가져오기
		//0. 클라이언트 요청(전송)시 전송되는 데이터를 받는다.
        
		//1. service 객체 얻어 오기 
		     iBuyerService service = BuyerServiceImpl.getservice();
				
		//2. service 메서드 호출 하기  - 결과를 받는다
			 List<BuyerVO> list = service.getBuyerNames();	
		//3. request객체에 결과를 저장한다. 
		     request.setAttribute("listvalue", list);
		//4. 결과로 출력 하거나 json데이터 생성 - jsp 응답 페이지
		 
	    //5. jsp 페이지로 forward
		     RequestDispatcher disp= request.getRequestDispatcher("1127/buyerNames.jsp");
		     disp.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// id 를 조건으로 해서 조회하기 
		//0. 클라이언트 요청(전송)시 전송되는 데이터를 받는다.
           String buyerId= request.getParameter("id");
		//1. service 객체 얻어 오기 
				iBuyerService service = BuyerServiceImpl.getservice();
		//2. service 메서드 호출 하기  - 결과를 받는다
				BuyerVO vo= service.getDetail(buyerId);
		//3. request객체에 결과를 저장한다. 
		      request.setAttribute("vo", vo);
		//4. 결과로 출력 하거나 json데이터 생성 - jsp 응답 페이지
		// jsp 페이지로 forward
		  request.getRequestDispatcher("1127/buyerDetail.jsp").forward(request, response);
		
		//doGet(request, response);
	}

}
