# Product Sales Report and Product Calculations System

## Project Overview

This project was developed using Java as part of a programming revision exercise. It demonstrates object-oriented programming concepts, including classes, interfaces, arrays, methods, loops, graphical user interfaces and unit testing.

The project consists of two main sections: a Product Sales Report and a Product Calculations Application.

## Question 1: Product Sales Report

The first section focuses on managing and reporting product sales information.

The application:
- Stores product names and monthly sales figures.
- Calculates total product sales.
- Calculates average sales.
- Identifies the most popular product.
- Uses an interface to define product-related methods.
- Displays the sales report through the PrintProduct class.

## Question 2: Product Calculations Application

The second section implements a graphical application using Java Swing.

The application allows users to:
- Enter a customer name.
- Select a product.
- Enter the product price.
- Calculate VAT at 15%.
- Calculate commission at 5%.
- Calculate the final total.
- Save transaction information in a text file named data.txt.

The application also includes File and Tools menus, with Exit, Process and Clear options.

## Technologies Used

- Java
- NetBeans IDE
- Java Swing
- JUnit 5
- Object-Oriented Programming

## Unit Testing

JUnit 5 is used to test the calculation methods and verify that the expected results are returned.

The tests cover:
- VAT calculation.
- Total calculation.
- Product calculation accuracy.

## How to Run the Project

1. Open NetBeans IDE.
2. Open the project folder.
3. Allow the project libraries to load.
4. Run the PrintProduct class to view the sales report.
5. Run the ProductApplication class to open the graphical application.
6. Enter the required information and click Process.

## Project Structure

- IProducts.java
- Product.java
- PrintProduct.java
- IProductCalculations.java
- ProductCalculations.java
- ProductApplication.java
- ProductCalculationsTest.java
- data.txt
- README.md

## Conclusion

This project demonstrates the practical application of Java programming concepts through product sales reporting and product calculations. It also demonstrates the importance of interfaces, graphical interfaces, file handling and unit testing in software development.
