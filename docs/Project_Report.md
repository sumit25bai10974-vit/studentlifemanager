# STUDENT LIFE MANAGER

### 1. Introduction

Student Life Manager is a command-line application developed using Java. The purpose of the project is to provide a simple system for maintaining student academic information and personal expense records.

### 2. Problem Statement

Students may maintain academic and expense information separately. This project provides a single terminal-based application for storing basic student details, courses, marks, CGPA and expenses.

### 3. Objectives

 Create and manage a student profile.
 Store course information and marks.
 Calculate grades and CGPA.
 Record and manage expenses.
 Save information using local files.
 Demonstrate important Java programming concepts.

### 4. Technologies Used

 Java
 Java Collections Framework
 File I/O
 Exception Handling
 Command-line interface

### 5. Modules

#### Student Profile
Stores name, roll number, branch and semester.

#### Course Management
Stores course code, course name, credits and marks. Grades are generated from marks.

#### CGPA Calculation
CGPA is calculated as a credit-weighted average of grade points.

#### Expense Manager
Allows users to add, view and delete expenses and calculate total and average spending.

#### File Management
Student, course and expense information is stored in text files inside the data folder.

### 6. Java Concepts Used

 Classes and Objects
 Constructors
 Encapsulation
 Methods
 if-else
 switch
 loops
 ArrayList
 Scanner
 Exception Handling
 File Handling

### 7. System Flow

text
Start
  
Main Menu
  
  +--> Student Profile
  |
  +--> Course Management
  |
  +--> Expense Manager
  |
  +--> Dashboard
  |
  +--> Save Data
  |
 Exit


### 8. Grade System

| Marks | Grade | Grade Point |

| 90-100 | A+ | 10 |
| 80-89 | A | 9 |
| 70-79 | B | 8 |
| 60-69 | C | 7 |
| 50-59 | D | 6 |
| 40-49 | E | 5 |
| Below 40 | F | 0 |

### 9. Testing

The application was checked for:
 Valid integer input
 Invalid numeric input
 Marks outside 0-100
 Invalid expense amounts
 Empty profile/course input
 Course deletion
 Expense deletion
 Data saving and loading

### 10. Limitations

 It is a single-user application.
 Data is stored in local text files.
 There is no login system.
 There is no database.
 The grading scale is fixed in the Java source code.

### 11. Future Scope

Possible future improvements include:
 Database integration
 GUI interface
 Attendance tracking
 Monthly expense reports
 Subject-wise performance charts
 Login and multiple student accounts

### 12. Conclusion

Student Life Manager demonstrates how Java can be used to build a practical command-line application using object-oriented programming, collections, file handling and exception handling. The project provides a foundation that can be expanded with additional student management features.
