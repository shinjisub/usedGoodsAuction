package auction.common.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@ComponentScan
public class CommonInterCeptor extends HandlerInterceptorAdapter {
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
		boolean loginCheck = true;
		try {
				//logininfo 세션값이 널일경우 
				if(request.getSession().getAttribute("logininfo") == null ){ 
					response.sendRedirect("/login"); 
					loginCheck = false; 
				} 
		} catch (Exception e) { 
			e.printStackTrace(); 
		} //널이 아니면 정상적으로 컨트롤러 호출
		
		return loginCheck; 
	}
}
