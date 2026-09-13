# Student Web Data App

## Project Overview

The **Student Web Data App** is a web-based application developed using **Spring Boot and Thymeleaf**. It allows users to view student information, add new students, filter students by department, and navigate through student records using pagination.

## Features

* Display a list of students.
* Add a new student.
* Filter students by department.
* Display student ID, name, department, and age.
* Navigate between student pages.
* Display student data dynamically using Thymeleaf.

## Technologies Used

* Java
* Spring Boot
* Spring MVC
* Thymeleaf
* HTML5
* Maven

## Application Features

### Student List

The Student List page displays the following details:

| Field      | Description        |
| ---------- | ------------------ |
| ID         | Unique student ID  |
| Name       | Student name       |
| Department | Student department |
| Age        | Student age        |

### Add Student

The **Add Student** link redirects the user to:

```text
/add
```

This page is used to add new student information.

### Filter Students

Users can filter students by entering a department name in the search box.

The filter form sends the department value to:

```text
/filter
```

Example:

```text
/filter?dept=CSE
```

### Pagination

The application provides page navigation:

```text
/page?page=0
/page?page=1
```

* Page 1 displays the first page of students.
* Page 2 displays the second page of students.

## Application Routes

| Method | URL            | Description                   |
| ------ | -------------- | ----------------------------- |
| GET    | `/`            | Display the student list      |
| GET    | `/add`         | Open the Add Student page     |
| GET    | `/filter`      | Filter students by department |
| GET    | `/page?page=0` | Display the first page        |
| GET    | `/page?page=1` | Display the second page       |

## Thymeleaf Usage

Thymeleaf is used to display student information dynamically.

```html
<tr th:each="s : ${students}">
    <td th:text="${s.id}"></td>
    <td th:text="${s.name}"></td>
    <td th:text="${s.department}"></td>
    <td th:text="${s.age}"></td>
</tr>
```

* `th:each` loops through the student list.
* `th:text` displays student details dynamically.

## Project Structure

```text
StudentWebDataApp
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── application packages
│   │   │
│   │   └── resources
│   │       ├── templates
│   │       │   ├── students.html
│   │       │   └── add.html
│   │       │
│   │       └── application.properties
│   │
│   └── test
│
├── pom.xml
└── README.md
```

## How to Run the Project

### 1. Clone the Repository

```bash
git clone https://github.com/kantamgowri05/StudentWebData.git
```

### 2. Open the Project

Open the project using:

* Eclipse
* Spring Tool Suite
* IntelliJ IDEA

### 3. Run the Application

Run the Spring Boot main application class.

You can also run the application using Maven:

```bash
mvn spring-boot:run
```

### 4. Open the Application

Open the following URL in your browser:

```text
http://localhost:8080/
```

## Future Enhancements

* Edit student details.
* Delete student records.
* Search students by name.
* Add email and phone number fields.
* Add database integration.
* Add validation for student details.
* Improve the design using CSS and Bootstrap.
* Add sorting and advanced pagination.
* Add student login and authentication.

## Author

**Kantam Gowri**

## GitHub Repository

[StudentWebData GitHub Repository](https://github.com/kantamgowri05/StudentWebData)
