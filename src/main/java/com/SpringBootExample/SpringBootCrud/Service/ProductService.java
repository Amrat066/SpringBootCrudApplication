package com.SpringBootExample.SpringBootCrud.Service;

import java.util.List;


import com.SpringBootExample.SpringBootCrud.Entity.Product;


public interface ProductService {
	
	public Product saveProduct(Product product);
	public List<Product> saveProducts(List<Product>product);
	public List<Product>getProduct();
	public Product getProductById(int id);
	public  Product getProductByName(String name);
	public String deleteProduct(int id);
	public Product updateProduct(Product product);

	
	
}
