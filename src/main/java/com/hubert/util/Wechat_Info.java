package com.hubert.util;

import org.apache.log4j.Logger;

import com.hubert.bean.AccessToken;

import net.sf.json.JSONException;
import net.sf.json.JSONObject;

public class Wechat_Info {
	private static final Logger logger = Logger.getLogger(Wechat_Info.class);  
	//获取access_token的URL地址（GET） 限200（次/天）  
	public final static String access_token_url ="https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
	/**
	 * 
	 * 获取access_token
	 * 
	 * @param appid 开发者ID
	 * @param appsecret 应用密钥
	 * @return 
	 */
	public static AccessToken getAccessToken(String appid,String appsecret){
		
		AccessToken accessToken = null;  
		String requestUrl = access_token_url.replace("APPID", appid).replace("APPSECRET", appsecret);  
	    JSONObject jsonObject = WechatUtil.httpGetRequest(requestUrl);  
	    // 如果请求成功  
	    if (null != jsonObject) {  
	        try {  
	            accessToken = new AccessToken();  
	            accessToken.setToken(jsonObject.getString("access_token"));  
	            accessToken.setExpiresIn(jsonObject.getInt("expires_in"));  
	        } catch (JSONException e) {  
	            accessToken = null;  
	            // 获取token失败  
	            logger.error("获取token失败 errcode:{"+jsonObject.getInt("errcode")+"} errmsg:{"+jsonObject.getString("errmsg")+"}");  
	        }  
	    }  
	    return accessToken;  
	}
//	/**
//	 * main test
//	 * @param args
//	 */
//	public static void main(String[] args){
//		String appId = "wx64e67d97dea340fe";
//		String appSecret = "d836824b1f884facad7e2f070c12d93e";
//		AccessToken accessToken = getAccessToken(appId,appSecret);
//		System.out.println(accessToken.toString());
//		try {
//			System.out.println(GetPropertiesValue.getValue("src/main/resources/config.properties", "ippId"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}
