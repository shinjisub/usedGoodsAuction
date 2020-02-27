package auction.front.join;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.mail.MessagingException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import auction.common.util.MailUtil;

@Controller
public class JoinController {
	
	@Autowired
	private SqlSession sql;
	
	@Resource(name="mailUtil")
	private MailUtil mailUtil;
	
	@RequestMapping(value = "/join")
	public String join(Locale locale, Model model) {
		return "/join/join";
	}
	
	@ResponseBody
	@RequestMapping(value="/emailProc")
	public String emailProc(@RequestParam HashMap<String, Object> param) throws UnsupportedEncodingException, MessagingException {
		System.out.println("reseponBody  : "+param);
		mailUtil.sendMail("<h1>테스트중</h1>", "spdlqjaksemf@naver.com");
		return "/join/join";
	}


}
