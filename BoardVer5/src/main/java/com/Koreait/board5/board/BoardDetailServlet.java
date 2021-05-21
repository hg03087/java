package com.Koreait.board5.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Koreait.board5.MyUtils;
import com.Koreait.board5.cmt.CmtDAO;

@WebServlet("/board/detail")
public class BoardDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iboard = MyUtils.getParamInt("iboard", request);
		int iuser = MyUtils.getLoginUserPK(request);
		System.out.println(iboard);
		BoardVO param = new BoardVO();
		param.setIboard(iboard);
		param.setIuser(iuser);      //로그인 user pk
		
		request.setAttribute("data", BoardDAO.selBoard(param));//글의 정보					
		
		request.setAttribute("cmtList", CmtDAO.selCmtList(iboard));				//댓글 리스트 정보					
		MyUtils.openJSP("board/boardDetail", request, response);
		
	}



}
