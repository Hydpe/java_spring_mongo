

# Spring Boot MongoDB CRUD Application

## Description

This project is a simple Spring Boot application that uses MongoDB as the database.
It provides REST APIs to perform basic CRUD operations on user data.

The project follows a layered structure using Controller, Service, and Entity classes.

---

## Technologies Used

Java
Spring Boot
Spring Web
Spring Data MongoDB
MongoDB
Maven

---

## Project Structure

com.mongoDB.mongo

Controllers
controller.java

Services
service.java

Entity
person.java

MongoApplication.java

---

## Entity Information

The person class represents a MongoDB document.

MongoDB collection name is `users`.

Fields used in the entity:

id
name
email
password
profession
age
country

---

## API Endpoints

Base URL is `/user`.

Get all users
GET /user/persons

Get user by name
GET /user/person/{name}

Save one user
POST /user/person

Save multiple users
POST /user/persons

Update user by name
PUT /user/person/{name}

Update multiple users
PUT /user/persons

Delete user by name
DELETE /user/person/{name}

Delete all users
DELETE /user/persons

---

## Sample Request Body

```
{
  "name": "John",
  "email": "john@gmail.com",
  "password": "1234",
  "profession": "Developer",
  "age": 25,
  "country": "India"
}
```

---

## How the Application Works

Controller receives HTTP requests.
Service layer processes the logic.
MongoDB stores and retrieves data.
Response is returned as JSON.

---

## How to Run the Project

Install Java and MongoDB.
Make sure MongoDB service is running.
Configure MongoDB connection in application.properties.
Run the Spring Boot application.
Test APIs using Postman or browser.

---

