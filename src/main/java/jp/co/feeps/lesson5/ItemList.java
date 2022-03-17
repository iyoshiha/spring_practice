package jp.co.feeps.lesson5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemList {
	
	@GetMapping("/iteminput")
	public String inputItem() {
		return "lesson5/input_item";
	}
	

	@GetMapping("/list")
	public String list(Model model) {
		
		List<String> itemList = new ArrayList<>();
		
		itemList.add("AND");
		itemList.add("BND");
		itemList.add("CND");
		
		model.addAttribute("itemList", itemList);
		
		return "lesson5/item_list";
	}
//	
//	@PostMapping("/itemAdd")
//	public String itemAdd (String item, HttpSession session) {
//		
//		List<String> itemList = (List<String>)session.getAttribute("itemList");
//		
//		if (itemList == null) {
//			itemList = new ArrayList<>();
//		}
//		
//		
//		itemList.add(item);
//		session.setAttribute("itemList", itemList);
//		return "lesson5/item_list2";
//	}
}
