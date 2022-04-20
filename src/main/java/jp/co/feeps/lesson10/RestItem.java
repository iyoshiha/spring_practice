package jp.co.feeps.lesson10;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.feeps.lesson9.Category;
import jp.co.feeps.lesson9.ItemForm;
import jp.co.feeps.lesson9.ItemJoinCategory;
import jp.co.feeps.lesson9.ItemJoinCategoryRepository;

@RestController
@RequestMapping("/restItemInfo")
public class RestItem {
	
	@Autowired
	ItemJoinCategoryRepository repository;
	
	@PostMapping
	public void registItem(ItemForm itemForm) {
		ItemJoinCategory itemJoinCategory = formToEntity(itemForm);
		repository.save(itemJoinCategory);
	}
	
	@GetMapping
	public List<ItemJoinCategory> getItem() {
		return repository.findAll();
	}
	
	@PutMapping
	public void updateItem(ItemForm itemForm) {
		
		ItemJoinCategory itemJoinCategory = formToEntity(itemForm);
		repository.save(itemJoinCategory);
	}
	
	@DeleteMapping
	public void deleteItem(int id) {
		repository.deleteById(id);
			
		
	}
	private ItemJoinCategory formToEntity(ItemForm itemForm) {
		ItemJoinCategory itemJoinCategory = new ItemJoinCategory();
		itemJoinCategory.setId(itemForm.getId());
		itemJoinCategory.setName(itemForm.getName());
		itemJoinCategory.setPrice(itemForm.getPrice());
		Category category = new Category();
		category.setId(itemForm.getCategoryId());
		itemJoinCategory.setCategory(category);
		return itemJoinCategory;
	}

}
