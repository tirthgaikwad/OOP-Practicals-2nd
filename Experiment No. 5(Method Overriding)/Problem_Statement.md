# Experiment No. 5 — Inheritance and Method Overriding Using Geometric Shapes

## Problem Statement

Write a Java program to demonstrate inheritance using geometric shapes. Create a base class `Shape` and derive subclasses such as `Circle`, `Rectangle`, and `Triangle`. Implement methods to calculate the area of each shape and display the results using method overriding.

## Aim

To develop a Java program demonstrating inheritance and method overriding using different geometric shapes.

## Objectives

- Create a base class `Shape`.
- Derive subclasses `Circle`, `Rectangle`, and `Triangle`.
- Implement methods to calculate the area of each shape.
- Use method overriding for area calculation.
- Display the area results for different shapes.

## Theory

**Inheritance** allows a class to acquire the properties and methods of another class. In this program, `Circle`, `Rectangle`, and `Triangle` inherit from the base class `Shape`.

**Method overriding** occurs when a subclass provides its own implementation of a method already defined in its parent class. Each subclass overrides the `calculateArea()` method to calculate the area according to its shape.

### Classes Used

1. **Shape:** Base class that defines the `calculateArea()` method.
2. **Circle:** Calculates area using the radius.
3. **Rectangle:** Calculates area using length and breadth.
4. **Triangle:** Calculates area using base and height.

## Area Formulas

- **Circle:** Area = π × radius × radius
- **Rectangle:** Area = length × breadth
- **Triangle:** Area = ½ × base × height

## Associated Tasks

1. Create a base class `Shape`.
2. Derive subclasses `Circle`, `Rectangle`, and `Triangle`.
3. Implement the `calculateArea()` method in each subclass.
4. Override the method to calculate the area of each shape.
5. Display the area results for all shapes.

## Concepts Used

- Classes and Objects
- Inheritance
- Method Overriding
- Polymorphism
- Methods
- Mathematical Calculations

## Exemplars and Utility

### Exemplars

1. Geometry Calculator
2. Computer Graphics Application
3. CAD Design Software
4. Engineering Drawing System

### Utility

This program helps in understanding inheritance, polymorphism, and method overriding. These concepts are useful in graphical applications, engineering software, mathematical programs, and computer-aided design systems.

## Expected Output

The program should calculate and display the areas of a circle, rectangle, and triangle using their respective dimensions and overridden methods.

## Conclusion

Thus, inheritance and method overriding are demonstrated successfully in Java by creating a base class `Shape` and subclasses `Circle`, `Rectangle`, and `Triangle`. Each subclass calculates and displays its area using its own implementation of the `calculateArea()` method.

