package com.hubert.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hubert.util.SHA1;


public class WechatCallbackApi extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String TOKEN = "Hubert_Token";

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String echostr = request.getParameter("echostr");
		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");

		String[] str = { TOKEN, timestamp, nonce };
		Arrays.sort(str);
		String bigStr = str[0] + str[1] + str[2];
		String digest = new SHA1().getDigestOfString(bigStr.getBytes()).toLowerCase();
		if (digest.equals(signature)) {
				response.getWriter().print(echostr);
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		//do something
	}
	
}
