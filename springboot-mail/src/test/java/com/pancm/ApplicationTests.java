package com.pancm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private JavaMailSender mailSender;
	
	@Test
	public void sendSimpleMail() throws Exception {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("337507950@qq.com");
		message.setTo("jay19950620@gmail.com");
		message.setSubject("主题：这是一封测试邮件！");
		message.setText("测试邮件内容");

		mailSender.send(message);
		System.out.println("发送成功！");
	}

}