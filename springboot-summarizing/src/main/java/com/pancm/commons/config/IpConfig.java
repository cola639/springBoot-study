package com.pancm.commons.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
/**
 * 
* Title: MyConfig
* Description:
* 自定义配置文件 
* Version:1.0.0  
* @author pancm
* @date 2018年1月20日
 */

@Configuration//使用@Configuration也可以  
@ConfigurationProperties(prefix = "ipconfig")//前缀  
@PropertySource(value = "classpath:ipconfig.properties")//配置文件路径  
public class IpConfig {  
  
    @Value("${ipWhiteList}")//需要使用@value注解来注入，否则是null  
    private String ipWhiteList;

	/**  
	 * 获取ipWhiteList  
	 * @return  ipWhiteList  
	 */
	public String getIpWhiteList() {
		return ipWhiteList;
	}

	/**  
	 * 设置ipWhiteList  
	 * @param String ipWhiteList  
	 */
	public void setIpWhiteList(String ipWhiteList) {
		this.ipWhiteList = ipWhiteList;
	}  
  
    
}  
