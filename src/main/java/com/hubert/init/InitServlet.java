package com.hubert.init;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;

import com.hubert.util.WechatUtil;

public class InitServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;    
	private static final Logger logger = Logger.getLogger(WechatUtil.class);  
    
    public void init() throws ServletException {    
        // 获取web.xml中配置的参数    
        TokenThread.appid = getInitParameter("appid");    
        TokenThread.appsecret = getInitParameter("appsecret");    
    
        logger.info("weixin api appid:{"+TokenThread.appid+"}");    
        logger.info("weixin api appsecret:{"+TokenThread.appsecret+"}");    
    
        // 未配置appid、appsecret时给出提示    
        if ("".equals(TokenThread.appid) || "".equals(TokenThread.appsecret)) {    
        	logger.error("appid and appsecret configuration error, please check carefully.");    
        } else {    
            // 启动定时获取access_token的线程    
            new Thread(new TokenThread()).start();    
        }    
    }    
}
