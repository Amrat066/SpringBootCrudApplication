package com.SpringBootExample.SpringBootCrud.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootExample.SpringBootCrud.Entity.Product;
import com.SpringBootExample.SpringBootCrud.Repository.ProductRepository;
import com.SpringBootExample.SpringBootCrud.Service.ProductService;



@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepository repositry;
	
	@Override
	public Product saveProduct(Product product) {
		
		return repositry.save(product);
	}

	@Override
	public List<Product> saveProducts(List<Product> product) {
		
		return repositry.saveAll(product);
	}

	@Override
	public List<Product> getProduct() {
		return repositry.findAll();
	}

	@Override
	public Product getProductById(int id) {
		return repositry.findById(id).orElse(null);
	}

	@Override
	public Product getProductByName(String name) {
		return repositry.findByName(name);
	}

	@Override
	public String deleteProduct(int id) {
		repositry.deleteById(id);
		return "the data is removed !! "+id;
	}
	
	@Override
	public Product updateProduct(Product product) {
	    Product existingProduct = repositry.findById(product.getId()).orElse(null);
	    if (existingProduct != null) {
	        existingProduct.setName(product.getName());
	        existingProduct.setQuantity(product.getQuantity());
	        existingProduct.setPrice(product.getPrice());
	        return repositry.save(existingProduct);
	    }
	    return null;
	}

}
