# Mark Entry System in Java With Arrays

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

3. **The progarm with exception handling:**
   ``` java
   // Method to input scores for 5 subjects with exception handling
   public void inputScore() {
      System.out.println("Enter marks for 5 subjects:");
      for (int i = 0; i < scores.length; i++) {
         while (true) {
               try {
                  System.out.print("Subject " + (i + 1) + ": ");
                  scores[i] = scanner.nextDouble();
                  if (scores[i] < 0 || scores[i] > 100) {
                     throw new IllegalArgumentException("Marks must be between 0 and 100.");
                  }
                  break;
               } catch (InputMismatchException e) {
                  System.out.println("Invalid input! Please enter a numeric value.");
                  scanner.next(); // Clear invalid input
               } catch (IllegalArgumentException e) {
                  System.out.println(e.getMessage());
               }
         }
      }
   }

   // Method to compute the total marks
   public double computeTotal() {
      double total = 0;
      for (double score : scores) {
         total += score;
      }
      return total;
   }

   // Method to compute the average marks
   public double average() {
      return computeTotal() / scores.length;
   }

   // Method to determine the grade based on the average score
   public char getGrade(double score) {
      if (score >= 80) return 'A';
      else if (score >= 70) return 'B';
      else if (score >= 60) return 'C';
      else if (score >= 50) return 'D';
      else return 'F';
   }

   // Method to sort scores in ascending order
   public void sortScores() {
      try {
         Arrays.sort(scores);
      } catch (Exception e) {
         System.out.println("An error occurred while sorting scores: " + e.getMessage());
      }
   }

   // Method to display the scores and results with exception handling
   public void displayResults() {
      try {
         System.out.println("Sorted Scores: " + Arrays.toString(scores));
         double total = computeTotal();
         double avg = average();
         char grade = getGrade(avg);
         System.out.println("Total Marks: " + total);
         System.out.println("Average Marks: " + avg);
         System.out.println("Average Grade: " + grade);
      } catch (Exception e) {
         System.out.println("An error occurred while displaying results: " + e.getMessage());
      }
   }
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
