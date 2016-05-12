package com.hubert.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hubert.util.SHA1;

@Controller
@RequestMapping(value = "/wechat")
public class WechatCheckController {
	/** 日志实例 */
	private static final Logger logger = Logger.getLogger(WechatCheckController.class);
	private String TOKEN = "Hubert_Token";
	
	//@RequestMapping(value = "/checktoken", method=RequestMethod.GET,produces = "text/html;charset=UTF-8")
	@RequestMapping(value = "/checktoken", method=RequestMethod.GET)
    public void initWeixinURL(
    		@RequestParam(value = "signature", required = true) String signature,
    		@RequestParam(value = "timestamp", required = true) String timestamp,
    		@RequestParam(value = "nonce", required = true) String nonce,
    		@RequestParam(value = "echostr", required = true) String echostr,
    		HttpServletResponse response
    	)throws IOException {
		logger.info("into wechat check");
//		String echostr = request.getParameter("echostr");
//		String signature = request.getParameter("signature");
//		String timestamp = request.getParameter("timestamp");
//		String nonce = request.getParameter("nonce");
		
		String[] str = { TOKEN, timestamp, nonce };
		Arrays.sort(str);
		String bigStr = str[0] + str[1] + str[2];
		String digest = new SHA1().getDigestOfString(bigStr.getBytes()).toLowerCase();
		PrintWriter writer = response.getWriter();
		if (digest.equals(signature)) {
				logger.info("wechat_checked");
				writer.print(echostr);
		}
		else{
				writer.print("error");
		}
		writer.flush();
		writer.close();

	}
}
