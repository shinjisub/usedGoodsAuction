package auction.front.joinController;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import auction.common.util.MailUtil;
import auction.front.joinService.JoinService;

/**
 * 
 * @author Jisub
 * 회원가입 관련 Controller
 */
@Controller
@RequestMapping(value="/join")
public class JoinController {
	
	@Autowired
	private JoinService joinService; 
	
	@Resource(name="mailUtil")
	private MailUtil mailUtil;

	
	@RequestMapping(value = "/join")
	public String join() {
		List<HashMap<String, Object>> data = joinService.getMemberList(new HashMap<String, Object>());
		System.out.println("data : "+data);
		
		return "/join/join";
	}
	
	@RequestMapping(value = "/joinProc")
	public void joinProc(@RequestParam HashMap<String, Object> data, HttpServletResponse response, HttpSession session) throws IOException {
		int result = 0;
		try { result = joinService.addMember(data); } catch (Exception e) { e.printStackTrace(); }
		if(result > 0){
			// 세션 등록
			session.setAttribute("userId", data.get("name"));
		}

		response.sendRedirect("/");
	}
	
	/**
	 * 
	 * @param param
	 * @return
	 * 이메일 전송
	 */
	@ResponseBody
	@RequestMapping(value="/emailProc")
	public String emailProc(@RequestParam HashMap<String, Object> param) throws UnsupportedEncodingException, MessagingException {
		mailUtil.sendMail("join", "spdlqjaksemf@naver.com");
		return "/join/join";
	}


}
