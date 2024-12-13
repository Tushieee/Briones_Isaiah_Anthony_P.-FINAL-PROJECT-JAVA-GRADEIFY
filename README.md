# Briones_Final_Project_OOP_Gradeify

# Project Overview
The Gradeify project is a Java-based grade calculator designed to compute students'
grades and determine whether they pass or fail. The system incorporates core Java 
concepts such as object-oriented programming and data manipulation, providing users
with a straightforward tool to calculate and assess their academic performance. 
This project is particularly useful for students learning Java programming, as it 
demonstrates practical applications of key concepts like conditionals, loops, and user input handling.

# Object-Oriented Principles
Abstraction: The GradingSystem class defines common functionality, while specific grade calculation is handled by its subclasses (StandardGrading and PassFailGrading).
Inheritance: The StandardGrading and PassFailGrading classes inherit from GradingSystem, sharing common properties and methods while implementing their own grade calculation logic.
Encapsulation: The fields score and overallItems are private, with getter and setter methods to access them.
Polymorphism: The program uses polymorphism to handle different grading methods, where the gradingSystem reference can point to either a 
              StandardGrading or PassFailGrading object and call the appropriate method.

# Sustainable Development Goals
Gradeify supports SDG 4: Quality Education, which aims to ensure inclusive, equitable, and quality education for all. 
By providing a flexible and fair grading system, Gradeify helps educators assess student performance consistently, promoting 
educational fairness and enhancing the learning experience for all students.

# Instructions
1. Select an option from 1 or 2 
  * Choosing either 1 or 2 will give you the calculator for your chose subjects
   
2. Enter the number of subjects
   * You will need to enter any amount of subjects for the system to grade
     
3. Enter the name of the subjects
   * Enter the name for each subjects --amount may vary depending on the chosen subjects previously promt--
     
4. Enter overall items
   * Enter the total items of your desired subject
     
5. Enter your score
   * Enter the score for the desired subject
  
6. Wait for the results it will be shown at the bottom


