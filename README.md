# 🎓 Mini Project – Student Management System (Java + JDBC + MVC)

This is a **console-based Student Management System** built using **Java**, **JDBC**, and **MVC Architecture**.  
It allows users to manage student data such as **Add, Display, Update, Delete** through a menu-driven program.

---
## 📌 Features

✔ Add new student  
✔ View all students  
✔ Update student details  
✔ Delete student record  
✔ JDBC connectivity with MySQL  
✔ Clean MVC folder structure  

---
## 🗂 Project File Structure

Mini_Project/ <br>
├── MyConnection.java               # Database connection file <br>
├── Student.java                    # Model Class <br>
├── StudModel.java                  # Handles CRUD operations <br>
├── StudView.java                   # User Input & Output <br>
├── StudController.java             # Connects Model & View <br>
└── StudMain.java                   # Main runner class <br>

---
## 🔧 Requirements
- Java JDK 8+  
- MySQL Database  
- JDBC Connector JAR  
- IDE (Eclipse / IntelliJ / VS Code)  

---

## 📥 Setup & Run

### 1️⃣ Create Database & Table

CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    branch VARCHAR(30),
    marks INT
);

### 2️⃣ Update DB username & password in `MyConnection.java`

Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/studentdb",
    "root",
    "your_password"
);

### 3️⃣ Compile & Run

javac *.java
java StudMain

---

## 🚀 Future Enhancements

🔹 Web version using Servlets + JSP  
🔹 GUI using Java Swing / JavaFX  
🔹 Search feature  
🔹 Export data to CSV/PDF  

---

## 👨‍💻 Developed By

**Shreyash Patil Gawande**  
Java Developer • Mini Projects for Learning

GitHub 💻: https://github.com/Shreyash9330

---

⭐ If you like this project, don’t forget to star the repo!
