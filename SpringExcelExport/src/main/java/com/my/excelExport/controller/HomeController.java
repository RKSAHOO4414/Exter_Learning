package com.my.excelExport.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.excelExport.excel.UserExcelExporter;
import com.my.excelExport.model.Student;
import com.my.excelExport.repository.StudentRepository;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String homePage() {
		return "HomePage";
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/export/excel")
	public void exportToExcel(HttpServletResponse response) throws IOException{
		response.setContentType("application/octet-stream");
		String headerKey = "Content-Disposition";  
		String headerValue = "attachment; filename=Student_info.xlsx";
		
		response.setHeader(headerKey, headerValue);
		List<Student> listStudent = studentRepository.findAll();
		UserExcelExporter exp = new UserExcelExporter(listStudent);
		exp.export(response);
		
	}
	
}
