# Boolean Expression Evaluator
["C:\Users\DELL\Pictures\Screenshots\Screenshot 2025-02-22 204100.png"](url)


## Overview
This project is a **Boolean Expression Evaluator** written in Java. It allows users to evaluate Boolean expressions by accepting values for logical variables. The program supports the basic Boolean operations: AND (`.`), OR (`+`), and NOT (`~`). The expressions are read from a text file, and the results of the evaluation are shown as either `1` (true) or `0` (false) based on the input values.

### Features:
- Evaluate Boolean expressions with AND, OR, and NOT operations.
- Read expressions and variable values from a file.
- Provide binary results based on logical evaluation (`1` for true, `0` for false).
- Handle multiple variables and expressions.

## Project Structure

### 1. **ExpressionApp** (Main Class)
- **Purpose:** The entry point to the application, responsible for initiating the evaluation process.
- **Responsibilities:**
  - Reads input expressions and variable values.
  - Uses `EvaluaterExpression` to evaluate Boolean expressions.

### 2. **EvaluaterExpression** (Subclass of `BooleanExpression`)
- **Purpose:** Evaluates Boolean expressions using the given input values.
- **Responsibilities:**
  - Performs the logical operations (AND, OR, NOT) based on the user's input.

### 3. **BooleanExpression**
- **Purpose:** The abstract class representing a Boolean expression.
- **Responsibilities:**
  - Stores the Boolean expression.
  - Defines methods for evaluating expressions and checking validity.

### 4. **Expression**
- **Purpose:** Holds individual Boolean expressions.
- **Responsibilities:**
  - Manages the expression's structure and provides getter/setter methods.

### 5. **And, Or, Negation**
- **Purpose:** Classes that represent the logical operations AND, OR, and NOT.
- **Responsibilities:**
  - Each class represents a specific operation and provides methods to evaluate it.

### 6. **Variables**
- **Purpose:** Stores the variables used in Boolean expressions.
- **Responsibilities:**
  - Holds the values of the variables and allows for evaluation.

### 7. **ExpressionInterface**
- **Purpose:** Interface that defines methods for checking and evaluating expressions.
- **Responsibilities:**
  - Contains a `checker` method to validate expressions.

## How It Works
1. **Input Expressions:** The user enters a Boolean expression (e.g., `p.q+~r`).
2. **Input Values:** The user provides values for each variable (`p`, `q`, `r`, etc.) where `1` is true and `0` is false.
3. **Expression Evaluation:** The program evaluates the expression using the provided values and performs the necessary logical operations.
4. **Output Result:** The result is displayed as `1` (true) or `0` (false) based on the evaluation.

### Example:
#### Input:
- Expression: `p.q+~r`
- Variables:
  - `p = 0`
  - `q = 1`
  - `r = 1`

#### Output:
- Result: `0` (Because `p.q` is `0` and `~r` is `0`)

## Requirements
- Java 8 or higher
- A text file with Boolean expressions and variable assignments
- Basic knowledge of Boolean logic

## Usage Instructions
1. Clone the repository or download the project files.
2. Open the project in a Java IDE (such as IntelliJ IDEA or Eclipse).
3. Run the `ExpressionApp` class.
4. Follow the prompts to enter the Boolean expression and the values for the variables.

#### Example Execution:
```plaintext
Enter a Boolean expression (e.g., A+B.C~D):
p.q+~r
Enter the number of variables:
3
Enter the name of variable 1:
p
Enter the value for p (0 for false, 1 for true):
0
Enter the name of variable 2:
q
Enter the value for q (0 for false, 1 for true):
1
Enter the name of variable 3:
r
Enter the value for r (0 for false, 1 for true):
1
Result: 0

