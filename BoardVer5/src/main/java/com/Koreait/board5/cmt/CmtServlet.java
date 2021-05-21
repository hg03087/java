package com.Koreait.board5.cmt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Koreait.board5.MyUtils;


@WebServlet("/board/cmt")
public class CmtServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iboard = MyUtils.getParamInt("iboard", request);
		int icmt = MyUtils.getParamInt("icmt", request);
		int iuser = MyUtils.getLoginUserPK(request);
		
		CmtVO param = new CmtVO();
		param.setIcmt(icmt);
		param.setIuser(iuser);
		
		CmtDAO.delCmt(param);
		System.out.println("iboard : "+iboard);
		response.sendRedirect("detail?iboard=" + iboard);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		int icmt = MyUtils.getParamInt("icmt", request);
		int iboard = MyUtils.getParamInt("iboard", request);
		String cmt = request.getParameter("cmt");	
		int iuser = MyUtils.getLoginUserPK(request);
		
		CmtVO param = new CmtVO();
		param.setCmt(cmt);
		param.setIuser(iuser);
		
		if(icmt != 0) {
			param.setIcmt(icmt);
			CmtDAO.updCmt(param);
		} else {
			param.setIboard(iboard);
			CmtDAO.insCmt(param);
		}

		response.sendRedirect("detail?iboard=" + iboard);	//주소(서블릿)끼리 넘겨줄땐 쿼리스트링 +
	}

}
