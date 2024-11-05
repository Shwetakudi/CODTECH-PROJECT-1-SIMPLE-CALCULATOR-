# Simple Java Calculator

This is a simple command-line calculator program written in Java. It allows users to perform basic arithmetic operations: addition, subtraction, multiplication, and division. The program prompts the user to enter two numbers and the operation they would like to perform.

## Features

- **Addition, Subtraction, Multiplication, and Division**: Supports basic arithmetic operations.
- **User-Friendly Interface**: Prompts guide the user through the operation selection and number inputs.
- **Error Handling**: Includes checks to prevent division by zero, and notifies the user if an invalid operation is entered.

## Getting Started

### Prerequisites

- **Java**: Make sure Java is installed on your system. You can download it from [Oracle's official website](https://www.oracle.com/java/technologies/javase-downloads.html).
- **Java Compiler**: Ensure `javac` is available to compile Java code.

### Installation

1. Clone this repository or copy the code into a `.java` file:
    ```bash
    git clone https://github.com/yourusername/java-calculator.git
    ```
   
2. Navigate to the directory containing the code:
    ```bash
    cd java-calculator
    ```

3. Compile the Java file:
    ```bash
    javac Hlo.java
    ```

4. Run the program:
    ```bash
    java Hlo
    ```

## Usage

1. When the program starts, you’ll see a welcome message along with the available operations.
   
2. Enter one of the following symbols to select an operation:
    - `+` for addition
    - `-` for subtraction
    - `*` for multiplication
    - `/` for division

3. Enter the two numbers when prompted.

4. The program will display the result or an error message if division by zero is attempted.

### Example

**Input**:
```
Enter the operation:
For addition ==> +
For subtraction ==> -
For multiplication ==> *
For division ==> /

Operation: +
Enter the first number: 10
Enter the second number: 5
```

**Output**:
```
The result is: 15
```

## Code Explanation

The program uses a `Scanner` object to capture input from the user. It verifies the operation and calculates the result accordingly. It also checks for division by zero to avoid runtime errors.
