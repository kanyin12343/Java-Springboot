# Employee Management System API


## Features
- **GET**: Retrieve employee details.
- **POST**: Add a new employee.
- **PATCH**: Update certain fields of an employee.
- **PUT**: Update areas of an employee record.
- **DELETE**: Remove an employee by ID.

### Key Highlights
- **Entity Management**: This application performs database activities using JPA with `EntityManager`.
- **Transactional Operations**: Guarantees that some critical operations will be performed atomically for the data.
- **Postman Integration**: Get access to access and test during your development cycle using Postman.
- **Customizable Responses**: JSON formatted responses in every action possible.

---

## Technologies Used
- **Java**: For the back-end logic and the entities in a firm's design.
- **Spring Boot**: To create structure and to start building the application.
- **Hibernate JPA**: SQL Allies supplies OpenERP with industrial-strength database management techniques for ORM and database management.
- **MySQL**: A system database based on relations to store the records of the employees.



## Getting Started

### Prerequisites
- **Java** (JDK 11 or later)
**MySQL** (Installed and running with a default user administrative interface).
> **Postman** (Optional, used in the testing of API End Points)

### Setup Instructions
1. Clone the repository:
    ```bash
    git clone <repository-url>
    ```
2. Configure the MySQL database in `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/<your-database-name>
    spring.datasource.username=<Your-Username>
    spring.datasource.password=<your-password>
    spring.jpa.hibernate.ddl-auto:update
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
    ```
3. Build and run the application:
    ```bash
    ./mvnw spring-boot:run
    ```
4. Access the API at `http://localhost:8080/api/v1`.


## API Endpoints

### Base URL: `/api/v1`

| Method | Endpoint               | Description                      |
|--------|-------------------------|----------------------------------|
| GET    | `/employees`            | Retrieve all employees           |
| GET    | `/employee`             | Retrieve employees (alt method)  |
| POST   | `/addemployee`          | Add a new employee               |
| PATCH  | `/{id}`                 | Update specific fields by ID     |
| PUT    | `/updateemployeefull/{id}` | Update all fields by ID          |
| DELETE | `/deleteemployee/{id}`  | Delete an employee by ID         |

---

## Using Postman for Testing
1. Open Postman.
2. Create a new request.
3. Enter the appropriate endpoint (e.g., `http://localhost:8080/api/v1/employees`).
4. Specify the HTTP method (GET, POST, PATCH, PUT, DELETE).
5. Add the required request body (if applicable) in JSON format for POST, PUT, or PATCH.

