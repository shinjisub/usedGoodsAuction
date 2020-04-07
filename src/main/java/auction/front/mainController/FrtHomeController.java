package auction.front.mainController;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrtHomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(FrtHomeController.class);
	
	@RequestMapping(value = "/home.com", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String FrtLogin() {
		return "/login/login";
	}
	
}
