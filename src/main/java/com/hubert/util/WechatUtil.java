package com.hubert.util;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import net.sf.json.JSONObject;


public class WechatUtil {
	
	private static final Logger logger = Logger.getLogger(WechatUtil.class);  
	 
	/**
	 * 已GET方式从微信URL返回数据 统一封装成JSONObject
	 * @param requestUrl 请求URL
	 */
	public static JSONObject httpGetRequest(String requestUrl) {  
			JSONObject jsonObject = null;
	        HttpClient client = HttpClients.createDefault();
	        HttpGet get = new HttpGet(requestUrl);
	        try {
	        	HttpResponse response = client.execute(get);//让client执行，访问网址
	        	HttpEntity entity = response.getEntity(); //用Entity接收当前访问的结果
				String result = EntityUtils.toString(entity, "UTF-8");  //转换成String
				jsonObject = JSONObject.fromObject(result);
	        }catch(ClientProtocolException e){
	        	logger.info("httpclient error");
	        }catch (IOException e) {
	        	logger.info("io error");
			} 
	        return jsonObject;  
	        
	 }
	/**
	 * 已POST方式从微信URL返回数据 统一封装成JSONObject
	 * @param requestUrl  URL
	 * @param outputStr  提交的数据
	 * @return
	 */
	public static JSONObject httpPostRequest(String requestUrl,List<BasicNameValuePair> output){
		
		return null;
	}
}	
