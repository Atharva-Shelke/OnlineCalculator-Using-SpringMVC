# Online Calculator using Spring MVC framework (Non-Boot)

## 📌 Overview

This project is a simple web-based calculator built using **Spring MVC without Spring Boot**.
It intentionally avoids auto-configuration to demonstrate core MVC concepts such as request handling, view resolution, and manual configuration.

---

## 🎯 Purpose

The goal of this project is to clearly demonstrate the **Spring MVC request lifecycle** and internal working by configuring everything manually instead of relying on Spring Boot.

---

## 🏗️ Tech Stack

* Java 17
* Spring MVC (5.x)
* JSP (Java Server Pages)
* Maven
* Apache Tomcat (External Server)

---

## 📁 Project Structure

```
src/
 ├── main/
 │    ├── java/
 │    │     └── com.Cal3/
 │    │           └── CalcController.java
 │    │
 │    └── webapp/
 │          ├── WEB-INF/
 │          │     ├── web.xml
 │          │     ├── spring-servlet.xml
 │          │     └── views/
 │          │           ├── Calculator3.jsp
 │          │           └── result.jsp
 │          │
 │          └── resources/
 │                └── css/
 │                     └── style.css
```

---

## 🔁 MVC Flow

```
Browser → DispatcherServlet → Controller → Model → ViewResolver → JSP
```

---

## ⚙️ Features

* Perform basic arithmetic operations:

  * Addition
  * Subtraction
  * Multiplication
  * Division
* Handles division by zero
* Clean UI using custom CSS
* Navigation between input and result pages

---

## 🧠 Key Concepts Demonstrated

* **DispatcherServlet**: Central request handler configured via `web.xml`
* **Controller Layer**: Uses `@Controller`, `@GetMapping`, `@PostMapping`
* **View Resolution**: Logical view names mapped to JSP via `InternalResourceViewResolver`
* **Model Handling**: Passing data from controller to view
* **Context Path Awareness**: Correct URL handling in WAR-based deployment

---

## 🚀 How to Run

### 1. Build the project

Run the following command in the project root directory (where `pom.xml` is located):

```
mvn clean package
```

### 2. Deploy WAR file

Copy the generated file:

```
target/OnlineCalculator.war
```

into your Apache Tomcat `webapps/` directory.

---

### 3. Start Tomcat server

---

### 4. Access application

```
http://localhost:8080/OnlineCalculator/
```

---

## ⚠️ Important Notes

* This project **does not use Spring Boot**
* Configuration is done manually using:

  * `web.xml`
  * `spring-servlet.xml`
* Uses JSP instead of Thymeleaf
* Requires external servlet container (Tomcat)

---
