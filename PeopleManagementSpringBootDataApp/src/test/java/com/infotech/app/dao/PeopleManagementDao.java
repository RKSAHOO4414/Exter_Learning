package com.infotech.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infotech.app.entity.Person;

public interface PeopleManagementDao extends JpaRepository<Person, Integer> {

}
