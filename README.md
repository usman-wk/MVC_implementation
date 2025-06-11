# 🎓 Student GPA Analyzer (Java - MVC Pattern)

A simple Java application that follows the **Model-View-Controller (MVC)** design pattern to manage and analyze student GPA data. This project demonstrates how to structure a Java program using clean, modular code.

## 📌 Overview

This application allows you to:
- Add student records (name and GPA).
- Calculate the average GPA.
- Display all student records.
- Filter and show students **above** and **below** the average GPA.

It's an educational project aimed at helping beginners understand how MVC architecture works in Java.

---

## 🧠 Concepts Demonstrated

- Object-Oriented Programming (OOP)
- MVC Design Pattern
- Java Collections (`List`)
- Data Aggregation and Filtering
- Modular Code Structure (3-Tier Packaging)

---

## 📂 Project Structure

```

StudentGPAAnalyzer/
├── controller/
│   └── StudentController.java
├── model/
│   ├── Student.java
│   └── StudentModel.java
├── view/
│   └── StudentView\.java
└── Main.java

````

- `model/`: Contains the `Student` class and `StudentModel` for business logic.
- `view/`: Responsible for displaying data in the console.
- `controller/`: Coordinates between model and view.
- `Main.java`: Entry point of the application.

---

## 💻 Getting Started

### Prerequisites

- Java JDK 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code)

### How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/StudentGPAAnalyzer.git
````

2. Open the project in your IDE.
3. Run `Main.java`.

---

## 🔧 Possible Enhancements

* Add input/output file support (CSV, JSON).
* Implement a graphical user interface (GUI) using JavaFX or Swing.
* Integrate sorting functionality (by name or GPA).
* Extend with search/filter by name or GPA range.

---

## 📜 License

This project is open-source and available under the [MIT License](LICENSE).

---
