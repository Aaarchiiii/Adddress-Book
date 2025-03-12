package com.example.Address_Book.repositories;

import com.example.Address_Book.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

    public EmployeeEntity findByEmail(String email);

}