package com.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.entity.Product;
import com.helper.Helper;
import com.service.ProductService;

@RestController
@CrossOrigin("*")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/product/upload")
	public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file){
		
		if(Helper.checkExcelFormat(file)) {
			//true
			
			this.productService.save(file);
			
			return ResponseEntity.ok(new HashMap<>().put("message", "File is uploaded and data is saved to db"));
			
		}
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload excel file only");
	}
	
	@GetMapping("/product")
	public List<Product> getAllProduct(){
		return this.productService.getAllProducts();
	}
	
}
