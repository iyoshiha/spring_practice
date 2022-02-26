package jp.co.feeps.lesson2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Index {


	
	@GetMapping("/g")
	public String index() {
		return "lesson2/top";
	}
	
	@PostMapping("/")
	public String index2() {
		return "index";
	}
	
	@RequestMapping(path="", method= {RequestMethod.GET, RequestMethod.POST})
	public String index3() {
		return "index";
	}

	
	
}
