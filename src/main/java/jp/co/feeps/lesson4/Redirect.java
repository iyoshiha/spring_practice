package jp.co.feeps.lesson4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Redirect {
	
	@GetMapping("/redirect")
	public String redirect() {
		
//		return "redirect:http://feeps.co.jp";
		System.out.println("redirect() is called");
		return "redirect:/source";
	}
}
