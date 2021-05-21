package com.Koreait.board5;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Koreait.board5.user.UserVO;



public class MyUtils {
	public static UserVO getLoginUser(HttpServletRequest req) {     //로그인 정보 가져오기
		if(req == null) { return null; }
		HttpSession hs = req.getSession();
		return (UserVO) hs.getAttribute("loginUser");
	}
	
	public static int getParamInt(String key, HttpServletRequest req) {
		String val = req.getParameter(key);
		int intVal = parseStringToInt(val);
		return intVal;
	}
	
	public static int parseStringToInt(String val) {
		try {
			int result = Integer.parseInt(val); 
			return result;
		} catch (Exception e) {
			return 0;
		}
	}

	public static void openJSP(String fileNm, HttpServletRequest req, HttpServletResponse res)  throws ServletException, IOException {
	 
		String jsp = "/WEB-INF/view/" + fileNm + ".jsp";
		req.getRequestDispatcher(jsp).forward(req, res);	
	}

	public static int getLoginUserPK(HttpServletRequest request) {    //로그인 정보에서 iuser 값만 가져오기
		if(request == null) { return 0; }
		return getLoginUser(request).getIuser();
	}


}
