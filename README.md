# Student HR Management System

A clean, modular Java-based CLI application designed to manage student profiles and mock interview ratings. The system provides secure profile editing via a PIN and integrates with SQLite for persistent storage of student records.

---

## 🚀 2-Minute Recruiter Walkthrough

Here is a quick way to explain this project to a recruiter:
1. **Overview**: "This is a Student and HR Management command-line tool. It manages student profiles (personal and educational details) and tracks mock interview evaluations."
2. **Architecture**: "It is built with Java 17 and structured into clear layers, including a DAO (Data Access Object) layer using JDBC to persist student records to a local SQLite database."
3. **Core Features**:
   - **Student Module**: Allows creating and viewing profile details (including educational history). Profile editing is secured via a PIN.
   - **HR / Evaluation Module**: Allows trainers/HR to record mock interview performance (subject, trainer, date, and rating) in-memory.
4. **Takeaway**: "It demonstrates standard Java development practices: separation of concerns, SQLite database integration, secure conditional updates, and robust command-line interface design."

---

## 🛠️ Tech Stack
- **Language**: Java 17
- **Database**: SQLite (via JDBC driver)
- **Build Tool**: Maven

---

## ✨ Key Features
- **Student Profile Creation**: Capture personal details (Name, Email, Contact, Address) and security PIN, followed by multiple educational qualifications (Course, Year of Passing, University, Marks).
- **Secure Editing**: Modifying sensitive fields like Name, Email, Contact, or PIN requires entering the matching security PIN.
- **SQLite Database Persistence**: Student profile data is saved to a local SQLite database (`studentmanagement.db`). On restart, the program connects and can retrieve all saved student profiles.
- **Mock Interview Tracker**: In-memory storage and display of mock interview reports, containing the subject, trainer's name, date, and rating.

---

## 🏃 How to Build and Run

### Prerequisites
- **Java Development Kit (JDK) 17 or higher**
- **Apache Maven**

### Steps
1. **Clone the Repository** and navigate to the project directory:
   ```bash
   cd student_manag_proj
   ```
2. **Build and Compile** the project using Maven:
   ```bash
   mvn clean compile
   ```
3. **Run the Application**:
   ```bash
   mvn exec:java -Dexec.mainClass="student_manag.Driver"
   ```

---

## 🔮 Future Improvements
Based on the current codebase, the following enhancements would be logical next steps:
1. **Mock Rating Persistence**: Persist mock interview records in the SQLite database (they are currently saved in-memory during program execution).
2. **Complete the Requirements Module**: Implement the `Requirement` entity features (currently stubbed out).
3. **Database-Driven Student Authentication**: Authenticate students using their PIN retrieved from the SQLite database instead of the active session reference.
4. **Graphical User Interface (GUI)**: Build a simple Swing/JavaFX frontend or web interface to replace the command-line interface.
