# Employee Database Management System

This is a simple Java application that interacts with a relational database to manage employee data. It uses JDBC to perform CRUD (Create, Read, Update, Delete) operations on an `employee` table in the `employee_db` database. The application consists of an `Employee` entity class and an `EmployeeData` class for handling database operations.

---

## Features

- **Create**: Add new employees to the database.
- **Read**: Fetch details of a specific employee or list all employees.
- **Update**: Modify details of an existing employee.
- **Delete**: Remove an employee from the database.

---

## Requirements

- **Java Development Kit (JDK)**: 8 or higher.
- **Apache Maven**: For dependency management.
- **PostgreSQL Database**: As the relational database system.
- **PostgreSQL JDBC Driver**: Added as a Maven dependency.

---

## Database Setup

1. Install and start **PostgreSQL Server**.
2. Open a PostgreSQL client (e.g., pgAdmin or terminal).
3. Create the `employee_db` database:
   ```sql
   CREATE DATABASE employee_db;
   ```
4. Connect to the `employee_db` database:
   ```sql
   \c employee_db
   ```
5. Create the `employee` table:
   ```sql
   CREATE TABLE employee (
       id SERIAL PRIMARY KEY,
       name VARCHAR(100) NOT NULL,
       position VARCHAR(100) NOT NULL,
       salary DOUBLE PRECISION NOT NULL,
       hire_date DATE NOT NULL
   );
   ```

---

## How to Run the Program

### Step 1: Clone the Repository
Clone the project repository from GitHub:
```bash
git clone https://github.com/your-username/employee-management-system.git
cd employee-management-system
```

### Step 2: Build the Project
Use Maven to build the project:
```bash
mvn clean install
```

### Step 3: Configure Database Connection
Update the database connection details in the `EmployeeData` class:
```java
private static final String URL = "jdbc:postgresql://localhost:5432/employee_db";
private static final String USER = "postgres"; // Replace with your PostgreSQL username
private static final String PASSWORD = "yourpassword"; // Replace with your PostgreSQL password
```

---

## Sample Operations

### Create an Employee
The application will insert a new employee into the `employee` table.

**Database State:**
```sql
INSERT INTO employee (name, position, salary, hire_date)
VALUES ('Student AlaToo', 'HR Manager', 60000, '2023-01-15');
```

**Screenshot:**
_(Include a screenshot showing the new employee in the database table.)_

---

### Retrieve an Employee by ID
The application fetches the details of an employee based on their ID.

**Database Query:**
```sql
SELECT * FROM employee WHERE id = 1;
```

**Screenshot:**
_(Include a screenshot showing the retrieved employee record.)_

---

### Update an Employee
Modify an employee's details, such as updating their salary.

**Database Query:**
```sql
UPDATE employee
SET salary = 65000
WHERE id = 1;
```

**Screenshot:**
_(Include a screenshot showing the updated employee record.)_

---

### Delete an Employee
Remove an employee from the `employee` table.

**Database Query:**
```sql
DELETE FROM employee WHERE id = 1;
```

**Screenshot:**
_(Include a screenshot showing the database after the employee is deleted.)_

---

## Project Structure

```
employee-database-management-system
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example
│   │   │       ├── App.java          # Main application
│   │   │       ├── Employee.java     # Employee entity class
│   │   │       └── EmployeeData.java # Database operations class
│   └── test
│       └── java
│           └── com.example
│               └── AppTest.java      # Unit tests (optional)
└── pom.xml                           # Maven configuration
```
