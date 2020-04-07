package auction.admin.mainController;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin")
public class AdmHomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdmHomeController.class);
	
	
	public String admLogin(Locale locale, Model model) {
		return "/admin/login/login";
	}
	
}
