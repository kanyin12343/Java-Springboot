//package com.example.demo.employee;
//
//
//
//import com.example.demo.employee.Employee;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class EmployeeService {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    public List<Employee> getAllEmployees() {
//        String sql = "SELECT * FROM employee";
//        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));
//    }
//}
//



package com.example.demo.employee;

// Import for dependency injection annotation from Spring Framework
import org.springframework.beans.factory.annotation.Autowired;

// Import for marking the class as a service in Spring Framework
import org.springframework.stereotype.Service;

// Import for List interface from Java Collections Framework
import java.util.List;

@Service // Marks this class as a service component in Spring Framework
public class EmployeeService {


    @Autowired // Automatically injects the EmployeeRepository bean into this service
    private EmployeeRepository employeeRepository; // Repository layer object for database operations

    public List<Employee> getAllEmployees() {
        // Calls the findAll method from EmployeeRepository to retrieve all employees from the database
        List<Employee> employees = employeeRepository.findAll();


//        // Example of handling null values
//        for (Employee employee : employees) {
//            if (employee.getSuper_id()!= null) {
//                int superId = employee.getSuper_id(); // Handle null case appropriately
//                // Perform operations with superId
//            }
//            // Similarly handle branchId if needed
//        }

        // Returns the list of employees
        return employees;
    }

//    @Autowired
//    private final EmployeeRepository employeeRepository;
//
//
//    @Autowired
//    public EmployeeService(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
//
//    public List<Employee> getAllEmployees() {
//        List<Employee> employees = employeeRepository.findAll();
//        // Process employees as needed
//        return employees;
//    }
//}

//    public List<Employee> getAllEmployees() {
//        return employeeRepository.findAll();
//    }
//    public List<Employee> getAllEmployees() {
//        try {
//            List<Employee> employees = employeeRepository.findAll();
//            // Add logging to check if employees are fetched correctly
//            if (employees.isEmpty()) {
//                System.out.println("No employees found.");
//            } else {
//                System.out.println("Fetched " + employees.size() + " employees.");
//            }
//            return employees;
//        } catch (Exception ex) {
//            // Log the exception for debugging purposes
//            ex.printStackTrace();
//            throw ex; // Re-throw the exception or handle it as appropriate
//        }
//    }

}



