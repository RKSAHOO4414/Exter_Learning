package com.my.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
