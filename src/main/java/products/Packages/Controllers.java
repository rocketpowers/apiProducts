package products.Packages;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import products.Packages.model.Product;
import products.Packages.repositories.ProductRepositorie;

@RestController
public class Controllers {

	@Autowired
	ProductRepositorie productRepositorie;

	@GetMapping("/list")
	public List<Product> allProducts() {
		return productRepositorie.findAll();
	}

	@GetMapping("/{id}")
	// public Optional<Product> findById(@PathVariable String id) {
	// return productRepositorie.findById(id);
	public Product getById(@PathVariable String id) {
		return productRepositorie.findById(id).get();
	}

	@PostMapping("/register")
	public Product Register(@RequestBody Product product) {
		return productRepositorie.save(product);
	}
	
	@PutMapping("/update")
	public Product update(@RequestBody Product product) {
		return productRepositorie.save(product);
	}
	
	@DeleteMapping("/{id}")
	public void delProduct(@PathVariable String id) {
		productRepositorie.deleteById(id);
		
	}
	
	
	
	
}

















