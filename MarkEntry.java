import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// Class for handling marks entry and calculations
public class MarkEntry {
    private double[] scores = new double[5];
    private Scanner scanner = new Scanner(System.in);

    // Method to input scores for 5 subjects with exception handling
    public void inputScore() {
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < scores.length; i++) {
            while (true) {
                try {
                    System.out.print("Subject " + (i + 1) + ": ");
                    scores[i] = scanner.nextDouble();
                    if (scores[i] < 0 || scores[i] > 100) {
                        throw new IllegalArgumentException("Marks should be between 0 and 100.");
                    }
                    break; // Exit loop if input is valid
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.next(); // Clear the invalid input
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

    // Method to sort scores in ascending order with exception handling
    public void sortScores() {
        try {
            Arrays.sort(scores);
        } catch (Exception e) {
            System.out.println("An error occurred while sorting the scores: " + e.getMessage());
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
}
