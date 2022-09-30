package com.my.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
