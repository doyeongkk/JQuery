package kr.or.ddit.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.board.service.BoardServiceImpl;
import kr.or.ddit.board.service.IBoardService;
import kr.or.ddit.board.vo.ReplyVO;


@WebServlet("/ReplyModify.do")
public class ReplyModify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ReplyModify() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		//0.
		int renum = Integer.parseInt(request.getParameter("renum"));
		String cont = request.getParameter("cont");
		
		
		
		//1.
		IBoardService service = BoardServiceImpl.getservice();
		//2.
		ReplyVO vo =  new ReplyVO();
		vo.setRenum(renum);
		vo.setCont(cont);
		
		int r = service.updateReply(vo);
		//3.
		
		request.setAttribute("renum", renum);
		
		//4.
		request.getRequestDispatcher("board/replyupdate.jsp").forward(request, response);
		
	}

}





















