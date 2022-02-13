package com.productapp.model.service;

import java.util.List;
import java.util.Optional;

import com.productapp.model.exceptions.DataAccessException;
import com.productapp.model.exceptions.ProductNotFoundException;
import com.productapp.model.persistence.Product;

public interface ProductService {
	public Product addProduct(Product product);
	public void deleteProduct(int id);
	public Product updateProduct(int id,Product product);
	public List<Product> getAll() throws DataAccessException;
	public Optional<Product> getById(int id) throws ProductNotFoundException;
}
