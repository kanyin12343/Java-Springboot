

package com.example.demo.employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//The persistence context in the context of Java Persistence API (JPA),
//         refers to the environment
//        where entities (Java objects mapped to database records)
//        are managed and persisted (stored) into the database. Here’s a breakdown of what the persistence context entails and its significance:
//
//        Persistence Context Overview
//        Entity Management:
//
//        Entities: These are Java objects that represent data stored in a database table. Each entity instance corresponds to a row in the table.
//        Persistence Context: It is an integral part of the EntityManager’s lifecycle and represents a set of managed entities that have been queried from or persisted to the database within a given transaction.
//

import java.util.List;

@Service // Marks this class as a Spring service component, making it a candidate for component scanning and enabling dependency injection
public class EmployeeService2 {

    @PersistenceContext // Injects an instance of EntityManager to interact with the persistence context (database operations)
    private EntityManager entityManager;

    // Method to retrieve all employees from the database
    public List<Employee> getAllEmployees2() {
        // Define the native SQL query to select all records from the employee table
        String query = "SELECT * FROM employee";
        // Execute the query and map the result to the Employee entity class, then return the result list
        return entityManager.createNativeQuery(query, Employee.class).getResultList();
    }


    //insert employee
    @Transactional
//     Ensures the method is executed within a transaction, meaning all operations will be committed or rolled back together
    public void insertEmployee(Employee employee) {
        entityManager.persist(employee);
    }

//
//    @Transactional
//    public void updateEmployee(Employee employee) {
//        entityManager.merge(employee);
//    }




    @Transactional
    public Employee updateEmployee(Long id, Employee employee) {
        // Find the existing employee
        Employee existingEmployee = entityManager.find(Employee.class, id);

        if (existingEmployee != null) {
            // Update only non-null fields
            if (employee.getFirst_name() != null) {
                existingEmployee.setFirst_name(employee.getFirst_name());
            }
            if (employee.getLast_name() != null) {
                existingEmployee.setLast_name(employee.getLast_name());
            }
            if (employee.getBirth_day() != null) {
                existingEmployee.setBirth_day(employee.getBirth_day());
            }
            if (employee.getSalary() != null) {
                existingEmployee.setSalary(employee.getSalary());
            }
            if (employee.getSex() != null) {
                existingEmployee.setSex(employee.getSex());
            }
            if (employee.getSuper_id() != null) {
                existingEmployee.setSuper_id(employee.getSuper_id());
            }

            // Ensure branch_id is set correctly
            if (employee.getBranch_id() != null) {
                existingEmployee.setBranch_id(employee.getBranch_id());
            } else {
                existingEmployee.setBranch_id(existingEmployee.getBranch_id()); // Retain existing branch_id
            }

            // Merge the updated entity
            entityManager.merge(existingEmployee);
        }
        return existingEmployee;
    }



    @Transactional
    public void deleteEmployee(int id) {
        Employee existingEmployee = entityManager.find(Employee.class, id);
        if (existingEmployee != null) {
            entityManager.remove(existingEmployee);
        }
    }


    @Transactional
    public void putEmployee(int id, Employee employee) {
        Employee existingEmployee = entityManager.find(Employee.class, id);
        if (existingEmployee != null) {
            existingEmployee.setFirst_name(employee.getFirst_name());
            existingEmployee.setLast_name(employee.getLast_name());
            existingEmployee.setBirth_day(employee.getBirth_day());
            existingEmployee.setSex(employee.getSex());
            existingEmployee.setSalary(employee.getSalary());
            existingEmployee.setSuper_id(employee.getSuper_id());
            existingEmployee.setBranch_id(employee.getBranch_id());
            entityManager.merge(existingEmployee);
        }



}
}



