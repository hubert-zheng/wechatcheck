package com.hubert.init;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.hubert.bean.AccessToken;
import com.hubert.util.GetPropertiesValue;
import com.hubert.util.Wechat_Info;

/**
 * 定时获取AccessToken
 * @author Hubrt
 *
 */
public class TokenThread implements Runnable{
	private static final Logger logger = Logger.getLogger(TokenThread.class);   
    // 第三方用户唯一凭证    
    public static String appid = "";
    
    // 第三方用户唯一凭证密钥    
    public static String appsecret = "";    
    public static AccessToken accessToken = null;    
    
    public void run() {    
        while (true) {    
            try {    
                accessToken = Wechat_Info.getAccessToken(appid, appsecret);    
                if (null != accessToken) {    
                	logger.info("获取access_token成功，有效时长{"+accessToken.getExpiresIn()+"}秒 token:{"+ accessToken.getToken() +"}");    
                    // 休眠7000秒    
                    Thread.sleep((accessToken.getExpiresIn() - 200) * 1000);    
                } else {    
                    // 如果access_token为null，60秒后再获取    
                    Thread.sleep(60 * 1000);    
                }    
            } catch (InterruptedException e) {    
                try {    
                    Thread.sleep(60 * 1000);    
                } catch (InterruptedException e1) {    
                	logger.error("{}", e1);    
                }    
                logger.error("{}", e);    
            }    
        }    
    }    
}
