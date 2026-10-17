# Employee Management System

# Employee Management System – Spring Boot

## About the Project

The Employee Management System is a web-based application developed using Java and Spring Boot to manage employee records and administrative operations. It integrates MySQL for data storage and Spring Security for authentication and role-based access control.

## Features

- User login and authentication
- Role-based authorization for administrators
- Employee record management
- Department and branch management
- Student information management
- Pending student and visa application management
- MySQL database integration
- Email functionality
- JSP-based web interface

## Technologies Used

- **Programming Language:** Java 11
- **Backend Framework:** Spring Boot
- **Web Framework:** Spring MVC
- **Security:** Spring Security
- **ORM:** Hibernate, Spring Data JPA
- **Database:** MySQL
- **Frontend:** JSP, HTML, CSS
- **Build Tool:** Maven
- **IDE:** Eclipse

## Project Structure

```text
JeewaEducation/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/graymatter/demo/
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── repo/
│   │   │       └── service/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
```

## Prerequisites

Install the following before running the project:

- Java JDK 11
- MySQL Server
- Eclipse IDE
- Maven

## Installation and Setup

### 1. Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/Employee-Management-System-Spring-Boot.git
```

### 2. Create the database

Open MySQL and execute:

```sql
CREATE DATABASE jeewaeducation;
```

### 3. Configure the database

Update `src/main/resources/application.properties` with your local MySQL configuration.

```properties
server.port=8989

spring.datasource.url=jdbc:mysql://localhost:3306/jeewaeducation
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update

spring.mvc.view.prefix=/WEB-INF/view/
spring.mvc.view.suffix=.jsp
```

Set `DB_USERNAME` and `DB_PASSWORD` to your local database credentials. Configure email credentials separately if you use the email functionality.

### 4. Run the application

**Using Eclipse:**

1. Import the project as an existing Maven project.
2. Wait for Maven dependencies to download.
3. Open `JeevaEducationApplication.java`.
4. Right-click and select **Run As → Java Application**.

**Using the terminal:**

```bash
mvn spring-boot:run
```

### 5. Open the application

Visit:

```text
http://localhost:8989
```

The login page or application home page will depend on the configured Spring Security and controller routes.

## Security

- Uses Spring Security for authentication and authorization.
- Uses BCrypt password encoding.
- Protects administrative endpoints according to user roles.
- Database and email credentials should be configured through environment variables and never committed to GitHub.

## Future Enhancements

- Add a user registration and password reset feature.
- Improve the dashboard and reporting functionality.
- Add input validation and centralized exception handling.
- Implement automated tests and deployment.

## Author

**Chetan Gaikwad**

GitHub: https://github.com/chetan6290

## License

This project is intended for educational and learning purposes. Add a suitable open-source license if you intend to distribute it.