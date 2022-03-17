package jp.co.feeps.lesson7;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ItemAdmin {
	
	@GetMapping("/inputAdmin")
	public String inputAdmin() {
		return "lesson7/input_admin";
	}
	
	
	@PostMapping("/registAdmin")
	public String registAdmin(String admin, HttpSession session) {
		session.setAttribute("admin", admin);
		
		
		System.out.println(session.getAttribute("admin"));
		return "lesson7/complete_admin";
	}
	
	@GetMapping("/deleteAdmin")
	public String deleteAdmin(HttpSession session) {
		session.removeAttribute("admin");
		
		System.out.println("deleted ::::");
		return "redirect:/inputAdmin";
	}
}
