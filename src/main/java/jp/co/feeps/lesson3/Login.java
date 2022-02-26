package jp.co.feeps.lesson3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Login {
	
	@GetMapping("login")
	public String login() {
		return "lesson3/login";
	}

//	@PostMapping("login")
//	public String loginCheck(String password, String userId/*, char c*/) {
//		
//		// System.out.println(c);
//		if (userId.equals("1") /*&& password.equals("abc")*/) {
//			return "lesson3/success";
//		} else {
//			return "lesson3/unsuccess";	
//		}
	
	@PostMapping("login")
	public String loginCheck(LoginForm loginForm) {
		
		// System.out.println(c);
		System.out.print(loginForm.getUserId());
		if (loginForm.getPassword().equals("j") /*&& password.equals("abc")*/) {
			return "lesson3/success";
		} else {
			return "lesson3/unsuccess";	
		}
	}
}
