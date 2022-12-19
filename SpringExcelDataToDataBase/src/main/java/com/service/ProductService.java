package com.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.entity.Product;
import com.helper.Helper;
import com.repo.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public void save(MultipartFile file) {
		
		try {
			List<Product> products = Helper.convertExcelToListOfProduct(file.getInputStream());
			this.productRepository.saveAll(products);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<Product> getAllProducts(){
		return this.productRepository.findAll();
	}
	
}
