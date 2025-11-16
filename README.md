# springboot-swagger-demo
Spring Boot project with Swagger/OpenAPI documentation

🚀 Spring Boot + Swagger + OpenAPI 3 Documentation

This project demonstrates how to integrate Swagger, OpenAPI 3, and Springdoc OpenAPI in a Spring Boot application.
It provides automatic API documentation, interactive testing, and clean API visualization.

📘 What You Will Learn

✅ What OpenAPI is and how it defines API specifications
✅ What Swagger is and how it helps design & test REST APIs
✅ What SpringFox is and why it is outdated
✅ What Springdoc OpenAPI is and why it is the modern replacement
✅ How Swagger UI works with Spring Boot
✅ How Springdoc scans controllers, request bodies & response bodies
✅ How to use /v3/api-docs and Swagger UI
✅ How to integrate Swagger/OpenAPI in Spring Boot easily

📂 Project Structure
src/main/java
 └── com.example.demo
      ├── controller
      ├── model
      └── DemoApplication.java

⚙️ Dependencies Used
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.5.0</version>
</dependency>

🌐 Access Swagger UI
Default Springdoc URL:
http://localhost:8080/swagger-ui/index.html

API Documentation (JSON format):
http://localhost:8080/v3/api-docs

▶️ How to Run
mvn spring-boot:run

OR

java -jar target/yourapp.jar

🛠 Tech Stack

Java 17 / 21
Spring Boot
Spring Web
Springdoc OpenAPI 3
Maven
