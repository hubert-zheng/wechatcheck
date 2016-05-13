package com.hubert.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class GetPropertiesValue {
	
	private static final Logger logger = Logger.getLogger(GetPropertiesValue.class);  
		
	public static String getValue(String fileNamePath, String key)throws IOException {  
        Properties props = new Properties();  
        InputStream in = null;  
        try {  
            in = new FileInputStream(fileNamePath);  
            // 如果将in改为下面的方法，必须要将.Properties文件和此class类文件放在同一个包中  
            //in = propertiesTools.class.getResourceAsStream(fileNamePath);  
            props.load(in);  
            String value = props.getProperty(key);  
            // 有乱码时要进行重新编码  
            // new String(props.getProperty("name").getBytes("ISO-8859-1"), "GBK");  
            return value;  
  
        } catch (IOException e) {  
        	logger.error("GetPropertiesValue->getValue io ERROR");
            return null;  
  
        } finally {  
            if (null != in)  
                in.close();  
        }  
    }  
}
