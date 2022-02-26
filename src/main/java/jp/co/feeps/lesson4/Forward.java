package jp.co.feeps.lesson4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Forward {
	
	@GetMapping("/source")
	public String source() {
		System.out.println("source() is called...");
		return "forward:/distination";
	}
	
	@GetMapping("/distination")
	public String distination() {
		System.out.println("distination() is called...");
		return "lesson4/forward";
	}
}
