package Projeto.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Projeto.entities.Product;
import Projeto.repositiries.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductRepository categoryRepository;

@GetMapping
public ResponseEntity<List<Product>>findAll(){
	List<Product> list= categoryRepository.findAll();
	
	return ResponseEntity.ok().body(list);
}

@GetMapping (value = "/{id}")
public ResponseEntity<Product>findById(@PathVariable long id){
	Product cat = categoryRepository.finByID(id);
	return ResponseEntity.ok().body(cat);
}
}
