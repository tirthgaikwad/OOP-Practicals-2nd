# Experiment No. 7 — ATM Machine Simulation Using Exception Handling

## Problem Statement

Develop a Java application that simulates an ATM machine. Implement functionalities such as checking account balance, withdrawing money, and depositing money.

Use `try`, `catch`, and `finally` blocks to handle potential exceptions such as insufficient funds (using `ArithmeticException`) and invalid input (using `IllegalArgumentException`). Ensure that the application continues to run smoothly after handling exceptions.

## Aim

To develop a Java ATM application using exception handling to perform banking operations and handle runtime errors safely.

## Objectives

- Create an ATM application with account balance management.
- Implement balance checking functionality.
- Implement deposit and withdrawal operations.
- Use `try`, `catch`, and `finally` blocks.
- Handle insufficient funds using `ArithmeticException`.
- Handle invalid amounts using `IllegalArgumentException`.
- Continue program execution after handling exceptions.

## Theory

**Exception handling** in Java is used to handle runtime errors and maintain the normal flow of a program.

### Exception Handling Keywords

1. **try:** Contains code that may generate an exception.
2. **catch:** Handles the exception when it occurs.
3. **finally:** Executes whether an exception occurs or not.
4. **throw:** Used to explicitly generate an exception.

### ATM Operations

1. **Check Balance:** Displays the current account balance.
2. **Deposit:** Adds money to the account.
3. **Withdraw:** Removes money from the account if sufficient balance is available.
4. **Exit:** Terminates the application.

## Associated Tasks

1. Create an ATM application.
2. Accept the initial account balance.
3. Implement balance checking, deposit, and withdrawal operations.
4. Handle insufficient funds using `ArithmeticException`.
5. Handle invalid amounts using `IllegalArgumentException`.
6. Use `try`, `catch`, and `finally` blocks for exception handling.
7. Ensure the application continues running after an exception.

## Concepts Used

- Classes and Objects
- Methods
- Exception Handling
- try, catch, and finally
- throw Keyword
- ArithmeticException
- IllegalArgumentException
- Loops and Switch Statements
- User Input Using Scanner

## Expected Output

The application should display an ATM menu and allow the user to check balance, deposit money, and withdraw money. It should display suitable error messages for invalid amounts and insufficient funds without terminating unexpectedly.

## Conclusion

Thus, an ATM simulation application is implemented successfully in Java using exception handling. The program performs basic banking operations and handles exceptions using `try`, `catch`, `finally`, and `throw`.

