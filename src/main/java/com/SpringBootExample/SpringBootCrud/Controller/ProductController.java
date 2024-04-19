package com.SpringBootExample.SpringBootCrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.SpringBootExample.SpringBootCrud.Entity.Product;
import com.SpringBootExample.SpringBootCrud.Service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	@PostMapping("/addproducts")
	public List<Product> addProducts(@RequestBody List<Product> products){
		return service.saveProducts(products);
	}
	
	@GetMapping("/GetProducts")
	public List<Product>findAllProducts(){
		return service.getProduct();
	}
	
	@GetMapping("/GetProduct/{id}")
	public Product FindProductById(@PathVariable int id) {
		return service.getProductById(id);
	}
	
	@GetMapping("/GetProducts/{name}")
	public Product FindProductByName(@PathVariable String name) {
		return service.getProductByName(name);
	}
	@PutMapping("/updateProduct") 
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProducts(@PathVariable int id) {
		return service.deleteProduct(id);
	}
	
	
	
	
	

}
