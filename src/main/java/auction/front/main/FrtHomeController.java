package auction.front.main;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FrtHomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(FrtHomeController.class);
	
	@RequestMapping(value = "/home.com", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		return "home";
	}
	
	@RequestMapping(value = "/frtLogin", method = RequestMethod.GET)
	public String FrtLogin(Locale locale, Model model) {
		return "/login/login";
	}
	
}
