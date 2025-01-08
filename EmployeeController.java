package com.example.demo.employee;

// Import for dependency injection annotation from Spring Framework
import org.springframework.beans.factory.annotation.Autowired;

// Import for RESTful controller annotations from Spring Web MVC
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Import for List interface from Java Collections Framework
import java.util.List;

@RestController // Indicates that this class is a REST controller
@RequestMapping("/api/v1") // Base path for all endpoints in this controller
public class EmployeeController {

    @Autowired // Automatically injects the EmployeeService bean into this controller
    private EmployeeService employeeService; // Service layer object for business logic

    @Autowired
    private EmployeeService2 employeeService2;

    @GetMapping("/employees") // Maps HTTP GET requests to this method
    public List<Employee> getAllEmployees() {
        // Calls the getAllEmployees method from EmployeeService and returns the list of employees
        return employeeService.getAllEmployees();
    }


    @GetMapping("/employee")
    public List<Employee> getAllEmployees2() {

        return employeeService2.getAllEmployees2();
    }


    @PostMapping("/addemployee")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
        // Calls the insertEmployee method of the employeeService2 instance to persist the Employee object
        employeeService2.insertEmployee(employee);
        return ResponseEntity.ok("{\"code\":\"00\",\"message\":\"Success\"}");

    }



    // Maps HTTP PATCH requests to /api/employees/{id}
    @PatchMapping("/{id}")

    //This annotation binds the HTTP request body to the employee parameter.
    // cIt expects the request body to contain JSON that can be converted into an Employee object.
    public ResponseEntity<String> renovateeEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        // Calls the service method to update the employee
         employeeService2.updateEmployee(id, employee);
//        if (updatedEmployee == null) {
//            return ResponseEntity.notFound().build();
//        }
        return ResponseEntity.ok("{\"code\":\"00\",\"message\":\"Success\"}");
//        return ResponseEntity.ok(updatedEmployee);

//        return ResponseEntity.ok("{\"code\":\"00\",\"message\":\"Success\"}");
//
    }




    // Delete an employee by ID
    @DeleteMapping("/deleteemployee/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id) {
        employeeService2.deleteEmployee(id);
        return ResponseEntity.ok("{\"code\":\"00\",\"message\":\"Delete Success\"}");
    }


    @PutMapping("/updateemployeefull/{id}")
    public ResponseEntity<String> updateEmployeeFull(@PathVariable int id, @RequestBody Employee employee) {
        employeeService2.putEmployee(id, employee);
        return ResponseEntity.ok("{\"code\":\"00\",\"message\":\"Update Success\"}");
    }


}





