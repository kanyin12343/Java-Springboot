package com.example.demo.employee;

// Import for JpaRepository from Spring Data JPA
import org.springframework.data.jpa.repository.JpaRepository;

// Import for marking the interface as a repository in Spring Framework
import org.springframework.stereotype.Repository;

@Repository // Indicates that this interface is a Spring Data repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // JpaRepository provides CRUD operations for the Employee entity with Integer as the ID type
}
