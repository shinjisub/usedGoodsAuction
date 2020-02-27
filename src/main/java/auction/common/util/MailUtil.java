package auction.common.util;

import java.io.UnsupportedEncodingException;
import java.util.Random;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

/**
 * MailSend Util 
 * @author Jisub
 *
 */
public class MailUtil {
	
	@Autowired
    private JavaMailSender mailSender;
	private MimeMessage message;
	private MimeMessageHelper messageHelper;
    
    private String subject, name, content, email;
    private int emailToken = 0;
	
	public MailUtil() {
		Random random = new Random();
		emailToken = random.nextInt(999999);
		
		this.subject = "[중고경매 이메일 인증입니다]";
		this.name    = "중고거래 관리자";
		this.content = "";
		this.email   = "";
		random       = null;
	}
	
	
	/**
	 * Email Send
	 * @param pContent
	 * @param pEmail
	 * @throws MessagingException
	 * @throws UnsupportedEncodingException
	 */
	public void sendMail(String pContent, String pEmail) throws MessagingException, UnsupportedEncodingException{
		this.message = mailSender.createMimeMessage();
		this.messageHelper = new MimeMessageHelper(message, true, "UTF-8");
		
		try {
			this.content   = pContent;
			this.email 	   = pEmail;  
		} catch (Exception e) { e.printStackTrace(); }
		
		messageHelper.setSubject(this.subject);
		messageHelper.setText(this.content, true);
		messageHelper.setFrom(this.email, name);
		messageHelper.setTo(this.email);

		mailSender.send(message);
	}
    

}
