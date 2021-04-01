package io.assignment.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.assignment.Model.Product;
import io.assignment.Repository.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/allProducts")
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	@GetMapping("/product/{id}")
	public Optional<Product> getProductById(@PathVariable("id") int id) {
		return productRepository.findById(id);
	}
	
	@PostMapping("/addProduct")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		productRepository.save(product);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Product> deleteProduct(@PathVariable("id") int id) {
		productRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		Product update = productRepository.findById(product.getId()).get();
		update.setName(product.getName());
		update.setCategory(product.getCategory());
		update.setPrice(product.getPrice());
		update.setType(product.getType());
		return productRepository.save(update);
	}
	
}
