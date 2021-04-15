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
 * Servlet implementation class MemberList
 */
@WebServlet("/List.do")
public class MemberList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
			             HttpServletResponse response) 
					throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//0. 클라이언트 요청(전송)시 전송되는 데이터를 받는다.
		         
		//1. service 객체 얻어 오기 
				IMemberService service = MemberServiceImpl.getService();
		//2. service 메서드 호출 하기  - 결과를 받는다
				List<MemberVO> list = service.getAllMember();
		//3. request객체에 결과를 저장한다. 
		        request.setAttribute("listvalue", list);
		//4. 결과로 출력 하거나 json데이터 생성 - jsp 응답 페이지
		 
	    //5. jsp 페이지로 forward
		
		request.getRequestDispatcher("1127/memberList.jsp").forward(request, response);
	}

}





