package pack02.email;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import org.apache.commons.mail.*;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Ex01_Sendmail {
	Properties properties; // properties <= 파일을 읽어오기 위한 객체.

	public Ex01_Sendmail() {
		properties = new Properties();
		try {
			properties.load(Ex01_Sendmail.class.getResourceAsStream("emailinfo.properties"));
//			System.out.println(properties.getProperty("email.id"));
//			System.out.println(properties.getProperty("email.pw"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws EmailException {
		Ex01_Sendmail es = new Ex01_Sendmail();
		es.htmlMail();
	}

	public void senSimple() throws EmailException {

		Email email = new SimpleEmail();
		email.setHostName("smtp.naver.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator(properties.getProperty("email.id"), properties.getProperty("email.pw")));
		email.setSSLOnConnect(true);
		//인코딩=============
		email.setCharset("utf-8");
		email.setDebug(true);
		//============
		email.setFrom(properties.getProperty("email.id"));
		email.setSubject("내용인가 ");
		email.setMsg("메일 확인중 ^.^");
		email.addTo(properties.getProperty("email.id"));
		email.send();
	}
	
	public void attachMail() throws EmailException {

		  // Create the attachment
		  EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath("D:\\Study_Java\\Study_Java\\WorkSpace\\14.IO\\img.jpeg");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription("Picture of John");
		  attachment.setName("John");
		  
		  
		  
		  
		  // Create the email message
		  MultiPartEmail email = new MultiPartEmail();
		  email.setHostName("smtp.naver.com");
		  email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator(properties.getProperty("email.id"), properties.getProperty("email.pw")));
			email.setSSLOnConnect(true);
			
			//인코딩=============
			email.setCharset("utf-8");
			email.setDebug(true);
			//============
			
			email.setFrom(properties.getProperty("email.id"));
			email.setSubject("내용인가 ");
			email.setMsg("메일 확인중 ^.^");
			email.addTo(properties.getProperty("email.id"));

	
		  
		  // add the attachment
		  email.attach(attachment);

		  // send the email
		  email.send();
		
	}

	public void htmlMail() throws EmailException {
		//파일 또는 url로 있는 이미지 등을 이메일에 첨부 
		EmailAttachment attach = new EmailAttachment();
		attach.setPath("C:\\Users\\admin\\Desktop\\images.jpg");
		
		HtmlEmail email = new HtmlEmail();
		
		
		email.setHostName("smtp.naver.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator(properties.getProperty("email.id"), properties.getProperty("email.pw")));
		email.setSSLOnConnect(true);
		//인코딩=============
		email.setCharset("utf-8");
		email.setDebug(true);
		//============
		email.setFrom(properties.getProperty("email.id"));
		email.setSubject("내용인가 ");
//		email.setMsg("메일 확인중 ^.^");
		StringBuffer msg = new StringBuffer();
		
		msg.append("<html>");
		msg.append("<body>");
		msg.append("<h3>메일 연습 ^.^</h3>");
		msg.append("<hr>");
		msg.append("html 형식으로 메일보내기");
		msg.append("<ul>");
		msg.append("<li>");
		msg.append("즐거운 금요일");
		msg.append("</li>");
		msg.append("<li>");
		msg.append("집에가고싶당");
		msg.append("</li>");
		msg.append("<ul>");
		
		msg.append("</ul>");
		msg.append("</body>");
		msg.append("</html>");
		
		email.setHtmlMsg(msg.toString()); //기존은 setMsg(x) => setHtmlMsg
		
		
		email.addTo(properties.getProperty("email.id"));
		
		email.attach(attach);
		attach = new EmailAttachment(); //기존에 컴퓨터에서 추가한 파일을 비우고 다시 만들기. 
		try {
			attach.setURL(new URL("https://img1.daumcdn.net/thumb/R1280x0/?fname=http://t1.daumcdn.net/brunch/service/user/8iOe/image/vj7e-_C9pqmQvrnSfRdDe86RbTA.jpg"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		email.attach(attach);
		
		email.send();
	}
	
}
