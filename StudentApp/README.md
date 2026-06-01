# Student Management System (Spring Boot + Hibernate Core)

A RESTful backend application built using **Spring Boot** and **Core Hibernate** for managing student records. This project demonstrates a strong foundation in backend layered architecture, custom session handling, and CRUD operations without relying on Spring Data JPA starters.

---

## 🚀 Features
* **Full CRUD Functionality:** Create, Read, Update, and Delete student records.
* **Layered Architecture:** Clear separation of concerns via Controller, Service, Repository, and Model layers.
* **Custom Hibernate Configuration:** Manual session and transaction management using `SessionFactory` and HQL.
* **REST Endpoints:** Follows standard HTTP methods (`GET`, `POST`, `PUT`, `DELETE`).

---

## 🛠️ Tech Stack & Architecture

* **Language:** Java 17+
* **Framework:** Spring Boot (Core Context & Web)
* **ORM Framework:** Hibernate (Core)
* **Database:** MySQL / PostgreSQL (Configured via `hibernate.cfg.xml`)

### Project Architecture Flow:
`Client (Postman/Browser)` ➡️ `StudentController` ➡️ `StudentService` ➡️ `Database (Repository)` ➡️ `Hibernate Session` ➡️ `Database`

---

## 📂 Project Structure

```text
src/main/java/com/example/App/
│
├── controller/
│   └── StudentController.java   # Exposes REST API endpoints
│
├── service/
│   └── StudentService.java      # Handles business logic (Annotated with @Service)
│
├── repository/
│   ├── Database.java            # Executes custom Hibernate/HQL queries
│   └── HibernateUtil.java       # Manages SessionFactory singleton instance
│
├── model/
│   └── Student.java             # Entity class mapped to 'StudentsInfo' table
│
└── AppApplication.java          # Spring Boot Main Bootstrapping class


```

Method,Endpoint,Description,Request Body / Path Variable
GET,/GET,Fetch all students,None
GET,/GET/{id},Fetch student's name by ID,{id} (Path Variable)
POST,/POST,Add a new student,JSON Student Object
PUT,/PUT,Update an existing student,JSON Student Object
DELETE,/DELETE/{id},Remove a student by ID,{id} (Path Variable)


