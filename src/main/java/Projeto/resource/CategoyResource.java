package Projeto.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Projeto.entities.Category;
import Projeto.repositiries.CategoryRepository;

@RestController
@RequestMapping(value = "/categories")
public class CategoyResource {
	
	@Autowired
	private CategoryRepository categoryRepository;

@GetMapping
public ResponseEntity<List<Category>>findAll(){
	List<Category> list= categoryRepository.findAll();
	
	return ResponseEntity.ok().body(list);
}

@GetMapping (value = "/{id}")
public ResponseEntity<Category>findById(@PathVariable long id){
	Category cat = categoryRepository.finByID(id);
	return ResponseEntity.ok().body(cat);
}
}
