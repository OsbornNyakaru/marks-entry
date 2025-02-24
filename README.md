# Mark Entry System in Java

## Overview
This Java program captures marks for 5 subjects, calculates the total and average marks, determines the average grade, sorts the marks in ascending order, and displays the results. The program consists of two classes:

1. **MarkEntry** - Handles input, calculations, and sorting of marks.
2. **MarksEntryDemo** - Contains the `main` method and runs the program.

## Features
- Accepts marks for 5 subjects from the user.
- Computes total and average marks.
- Determines the average grade based on the computed average.
- Sorts and displays the marks in ascending order.
- Outputs the final results to the console.

## Classes and Methods

### **1. MarkEntry Class**
Handles input and computation logic.

#### **Methods:**
- `inputScore()`: Captures scores for 5 subjects from the user.
- `computeTotal()`: Computes the total sum of all marks.
- `average()`: Calculates the average score.
- `getGrade(double score)`: Determines the grade based on the average.
- `sortScores()`: Sorts scores in ascending order.
- `displayResults()`: Displays sorted marks, total, average, and grade.

### **2. MarksEntryDemo Class**
The main class that initializes and runs the program.

#### **Methods:**
- `main(String[] args)`: Calls methods in `MarkEntry` to execute the program.

## How to Compile and Run
Ensure you have Java installed. Then:

1. **Compile the program:**
   ```sh
   javac MarksEntryDemo.java
   ```

2. **Run the program:**
   ```sh
   java MarksEntryDemo
   ```

## Example Output

```
Enter the marks for 5 subjects:

    Enter the marks for subject 1: 85
    Enter the marks for subject 2: 90
    Enter the marks for subject 3: 78
    Enter the marks for subject 4: 92
    Enter the marks for subject 5: 88

    Sorted marks: 78.0, 85.0, 88.0, 90.0, 92.0
    Total marks: 433.0
    Average marks: 86.6
    Grade: B
```             
