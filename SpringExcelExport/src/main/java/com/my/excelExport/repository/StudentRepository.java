package com.my.excelExport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.excelExport.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
