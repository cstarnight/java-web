package org.web.forget.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ControllerServlet
 */

public class ControllerServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String action = request.getParameter("action");
		
		if(!isValidated(request) && ("login".equals(action))){
			
		}
		
		
	}
	
	//判断是否已经登陆
	
	public boolean isValidated(HttpServletRequest request){
		
		HttpSession session = request.getSession();
		if(session.getAttribute("userName")!=null)
			return true;
		else
			return true;
	}
	
	//将请求直接导向指定页面
	private void gotoPage(String targetURL, HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException{
		RequestDispatcher rd;
		rd = request.getRequestDispatcher(targetURL);
		rd.forward(request, response);
		
	}
}
