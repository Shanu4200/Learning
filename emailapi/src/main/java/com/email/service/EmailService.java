package com.email.service;

import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Service
public class EmailService {
     
	public boolean sendEmail(String subject, String message, String to) {
		
		//Rest of the code
		
		boolean f = false;
		
		String from = "scmauth@gmail.com";
		
		//Variable for Gmail
		
		String host = "smtp.gmail.com";
		
		//Get the System Properties
		
		Properties properties = System.getProperties();
		System.out.println("PROPERTIES "+ properties);
		
		//Setting important information to properties object
		
		//HOST SET
		
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
		
		//Step 1: To get the Session Object
		
		Session session = Session.getInstance(properties, new Authenticator() {
			
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				
				return new PasswordAuthentication("scmauth@gmail.com", "*****");
			}
			
		});
		
		session.setDebug(true);
		
		//Step 2: Compose the message [text, Multimedia]
		
		MimeMessage m = new MimeMessage(session);
		
		try {
			
			//From Email
			m.setFrom(from);
			
			//Adding recipient to Message
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			
			//Adding subject to message
			m.setSubject(subject);
			
			//Adding Text to Message
			//m.setText(message);
			m.setContent(message, "text/html");
			
			//Send
			
			//Step 3: Send the Message using Transport Class
			Transport.send(m);
			
			System.out.println("Sent Successfully!!!");
			f = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
}
