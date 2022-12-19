package com.my.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.my.model.user.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
