# Student Life Manager

## Description

Student Life Manager is a command-line Java application designed to keep common student records in one place. It manages a student profile, course marks, CGPA and personal expenses.

## Features

 Student profile creation and update
Course management
 Marks and grade calculation
 Credit-weighted CGPA calculation
 Expense management
 Expense summary
 Dashboard
 Local file storage
 Input validation
 Command-line execution

## Technologies

 Java
 Object-Oriented Programming
 ArrayList
 File Handling Exception Handling
 Scanner

## Requirements

 Java JDK 8 or later
 Command Prompt / PowerShell / Terminal
 VS Code or any Java-compatible editor (optional)

## Project Structure

text
StudentLifeManager/
│
├── src/
│   ├── Main.java
│   ├── Student.java
│   ├── Course.java
│   ├── Expense.java
│   ├── StudentManager.java
│   ├── FileManager.java
│   └── InputHelper.java
│
├── data/
├── docs/


## How to Run

Open terminal in the project root.

### 1. Compile

bash
javac -d out src/*.java


### 2. Run

Windows:

bash
java -cp out Main


Linux/macOS:

bash
java -cp out Main


## How to Use

After starting the application, choose an option from the main menu.

### Student Profile

Create a profile by entering:
 Name
 Roll number
 Branch
 Semester

### Course Management

Add a course with:
 Course code
 Course name
 Credits
 Marks

The program automatically calculates the grade and grade point.

### CGPA

The CGPA is calculated using:

text
CGPA = Sum(Grade Point × Credits) / Sum(Credits)


### Expense Manager

Record expenses using a category and amount. The program can display the total and average expense and can delete an expense.

### Data Storage

When the application is saved or exited, records are stored in the data folder. The files are loaded again when the application starts.

## Example

text
1 Student Profile
2 Course Management
3 Expense Manager
4 Dashboard
5 Save Data
6 Exit


## Academic Purpose

This project demonstrates Java classes and objects, constructors, methods, conditional statements, loops, switch statements, collections, exception handling and file I/O.
