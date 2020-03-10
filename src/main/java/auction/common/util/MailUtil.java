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
	private JavaMailSender mailSender 		= null;
	private MimeMessageHelper messageHelper = null;
	private MimeMessage message       		= null;
	private StringBuffer sb 		  		= null;
	private int emailToken = 0;
    private String subject, name, content, email;


    /**
     * super()
     */
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
	 * Create Email Form
	 * @return
	 */
	public String createEmailForm(String type){
		sb = new StringBuffer();
		if("join".equals(type)){
			sb.append("<h1>회원가입</h1></br>").append("<span>회원가입을 축하드립니다. 감사합니다</span>");
		} else if("other".equals(type)){
			sb.append("<h1>이메일 인증입니다</h1></br>");
		}
		
		return sb.toString(); 
	}
	
	/**
	 * Email Send
	 * @param pContent
	 * @param pEmail
	 * @throws MessagingException
	 * @throws UnsupportedEncodingException
	 */
	public void sendMail(String emailType, String pEmail) throws MessagingException, UnsupportedEncodingException{
		this.message = mailSender.createMimeMessage();
		this.messageHelper = new MimeMessageHelper(message, true, "UTF-8");
		
		try {
			this.content   = this.createEmailForm(emailType);
			this.email 	   = pEmail;  
		} catch (Exception e) { e.printStackTrace(); }
		
		messageHelper.setSubject(this.subject);
		messageHelper.setText(this.content, true);
		messageHelper.setFrom(this.email, name);
		messageHelper.setTo(this.email);

		mailSender.send(message);
	}
    

}
