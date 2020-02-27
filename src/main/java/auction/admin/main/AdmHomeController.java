package auction.admin.main;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class AdmHomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdmHomeController.class);
	
	
	public String admLogin(Locale locale, Model model) {
		return "/login/login";
	}
	
}
