package Projeto.repositiries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import Projeto.entities.Category;

@Component
public class CategoryRepository {
	private Map<Long, Category> map = new HashMap<>();
	public void save(Category obj) {
		 map.put(obj.getId(), obj);
	}
	public  Category finByID(Long id ) {
		return map.get(id);
	}
	
	
	public List<Category> findAll(){
		return new ArrayList<Category>(map.values());
	}
}
