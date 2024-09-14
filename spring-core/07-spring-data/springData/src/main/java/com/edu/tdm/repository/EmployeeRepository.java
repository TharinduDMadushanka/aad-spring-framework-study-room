package com.edu.tdm.repository;

import com.edu.tdm.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

/**
 * JpaRepository: Provides basic CRUD operations without requiring an implementation.
 * @Repository: Indicates that the interface is a repository in the persistence layer.
 */