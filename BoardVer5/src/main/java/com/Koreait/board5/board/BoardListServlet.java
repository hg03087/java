package com.Koreait.board5.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Koreait.board5.MyUtils;
import com.Koreait.board5.user.UserVO;



@WebServlet("/board/boardList")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession();
		UserVO loginUser = (UserVO) hs.getAttribute("loginUser");
		if(hs.getAttribute("loginUser") == null) {    //로그인이 안됨
			response.sendRedirect("/user/userLogin");  
			return;
			}
		
		List<BoardVO> list = BoardDAO.selBoardList();
		request.setAttribute("list", BoardDAO.selBoardList());     //다음 페이지에서 리스트라 함은 boardDAO의 셀보드리스트로 사용
		MyUtils.openJSP("/board/boardList", request, response);
	}


}
