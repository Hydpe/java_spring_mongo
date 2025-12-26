Spring Boot MongoDB CRUD Application

This is a simple Java Spring Boot application that uses MongoDB as the database.
The project demonstrates basic CRUD operations using REST APIs.

Project Overview

This application allows you to manage user data stored in MongoDB.
You can create, read, update, and delete users using HTTP endpoints.

The project is structured using controller, service, and entity layers.

Technologies Used

Java

Spring Boot

Spring Web

Spring Data MongoDB

MongoDB

Maven

Project Structure
com.mongoDB.mongo
│
├── Controllers
│   └── controller.java
│
├── Services
│   └── service.java
│
├── Entity
│   └── person.java
│
└── MongoApplication.java

Entity Details

The person entity represents a MongoDB document.

Fields used:

id

name

email

password

profession

age

country

The data is stored in the users collection in MongoDB.

REST API Endpoints

Base URL:

/user

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

Sample JSON Request Body
{
  "name": "John",
  "email": "john@gmail.com",
  "password": "1234",
  "profession": "Developer",
  "age": 25,
  "country": "India"
}

How to Run the Project

Make sure MongoDB is running

Update MongoDB connection details in application.properties

Run the Spring Boot application

Use Postman or browser to test the APIs

Purpose of This Project

This project is created to understand:

Spring Boot REST APIs

MongoDB integration

CRUD operations

Layered architecture
