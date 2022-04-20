package jp.co.feeps.lesson10;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restBookInfo")
public class RestBook {

	@GetMapping
	public List<String> getBookList() {

		List<String> bookList = new ArrayList<>();
		bookList.add("city");
		bookList.add("bugs");
		bookList.add("gynnastics");
		
		return bookList;
	}

}
