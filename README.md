# # 🐦 Twitter App

A full-stack Twitter clone built using **Spring Boot**, **Spring Security**, **Thymeleaf**, and **SQL**.

This project allows users to register, log in, create posts, and view others' posts — just like Twitter!

---

## 🚀 Features

- 🔐 User Registration & Login
- 🛡️ Spring Security-based Authentication
- 🧑‍🤝‍🧑 Role-based Access (User/Admin)
- 📝 Create and View Posts
- 💾 Data persistence with Spring Data JPA & MySQL
- 🌐 Thymeleaf-based HTML templates for UI
- 📸 Custom background and styled UI

---

## 🛠️ Tech Stack

- **Backend:** Java, Spring Boot, Spring Security, Spring Data JPA
- **Frontend:** HTML, CSS, Thymeleaf
- **Database:** SQL
- **Build Tool:** Maven

---

## 📁 Folder Structure
├── src │ └── main │ ├── java │ │ └── com.example.twitter │ │ ├── config │ │ │ └── SecurityConfig.java │ │ ├── controller │ │ │ ├── PostController.java │ │ │ └── UserController.java │ │ ├── model │ │ │ ├── Post.java │ │ │ └── User.java │ │ ├── repository │ │ │ ├── PostRepository.java │ │ │ └── UserRepository.java │ │ ├── service │ │ │ ├── PostService.java │ │ │ ├── PostServiceImpl.java │ │ │ ├── UserService.java │ │ │ └── UserServiceImpl.java │ │ └── TwitterAppApplication.java │ └── resources │ ├── static │ │ ├── background.jpg │ ├── templates │ │ ├── login.html │ │ ├── register.html │ │ ├── home.html │ │ └── add.html │ └── application.properties ├── pom.xml
