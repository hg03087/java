package com.Koreait.board5.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Koreait.board5.MyUtils;
import com.Koreait.board5.user.UserVO;




@WebServlet("/board/write")
public class BoardWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession();
		UserVO loginUser = (UserVO) hs.getAttribute("loginUser");         
		if(loginUser == null) {
			response.sendRedirect("/user/userLogin");    
			return;
			}
		
		MyUtils.openJSP("board/BoardWrite", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title"); 
		String ctnt = request.getParameter("ctnt");
		
	
		int iuser = MyUtils.getLoginUserPK(request);             
		
		
		
		BoardVO param = new BoardVO();
		param.setIuser(iuser);
		param.setTitle(title);
		param.setCtnt(ctnt);
		
		BoardDAO.insBoard(param);
		
		response.sendRedirect("/board/boardList");
	}

}
