package auction.common.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class CommonInterCeptor extends HandlerInterceptorAdapter {
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){

		/**
		 *  1. 로그인 체크
			2. 이메일 발송
			3. 엑셀다운로드
			4. 데이터 암호화
		 */
		boolean loginCheck = true;
		try {
			loginCheck = false; 
			if(request.getSession().getAttribute("logininfo") == null){ 
				response.sendRedirect("/login"); 
			}
		} catch (Exception e) {System.out.println("e : "+e);}
		
		return loginCheck; 
	}

}
