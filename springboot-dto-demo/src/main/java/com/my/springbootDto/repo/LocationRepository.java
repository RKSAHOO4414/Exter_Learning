package com.my.springbootDto.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.springbootDto.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
