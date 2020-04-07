package auction.front.joinController;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import auction.common.util.MailUtil;
import auction.common.util.UploadUtil;
import auction.front.joinService.JoinService;

/**
 * 회원가입 관련 Controller
 */
@Controller
@RequestMapping(value="/join")
public class JoinController {
	
	@Autowired
	private JoinService joinService;

	@Resource(name="mailUtil")
	private MailUtil mailUtil;

	@Resource(name="uploadUtil")
	private UploadUtil upload;
	
	private static final Logger logger = LoggerFactory.getLogger(JoinController.class);

	
	@RequestMapping(value = "/join")
	public String join() {
		//mysql-server 강제 insert를 위한 테스트!! 계속해서 NULL값이 들어간다... 흠...
		System.out.println("insert : "+joinService.addMember(new HashMap<String,Object>()));
		System.out.println("getMemberList : "+joinService.getMemberList(new HashMap<String,Object>()));
		return "/join/join";
	}
	
	@RequestMapping(value = "/joinProc",  method=RequestMethod.POST)
	public void joinProc(@RequestParam HashMap<String, Object> data, HttpServletResponse response, HttpSession session) throws IOException {
		int result = 0;
		try {
			result = joinService.addMember(data);
		} catch (Exception e) { e.printStackTrace(); }
		if(result > 0){
			// 세션 등록
			session.setAttribute("userId", data.get("name"));
		}

		response.sendRedirect("/");
	}
	
	/**
	 * ID duplicate
	 * @param param
	 * @return
	 */
	@RequestMapping(value="/memberIdDuplicate")
	public @ResponseBody int memberIdDuplicate(@RequestParam HashMap<String, Object> param) {
		int result = joinService.getMemberIdDuplicate(param);
		return result;
	}
	
	/**
	 * 
	 * @param param
	 * @return
	 * 이메일 전송
	 */
	@RequestMapping(value="/emailProc")
	public @ResponseBody String emailProc(@RequestParam HashMap<String, Object> param) throws UnsupportedEncodingException, MessagingException {
		mailUtil.sendMail("join", "spdlqjaksemf@naver.com");
		return "/join/join";
	}

}
