import java.util.Arrays;
import java.util.Scanner;

// Class for handling marks entry and calculations
public class MarkEntry {
    private double[] scores = new double[5];
    private Scanner scanner = new Scanner(System.in);

    // Method to input scores for 5 subjects
    public void inputScore() {
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
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
        Arrays.sort(scores);
    }

    // Method to display the scores and results
    public void displayResults() {
        System.out.println("Sorted Scores: " + Arrays.toString(scores));
        double total = computeTotal();
        double avg = average();
        char grade = getGrade(avg);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
        System.out.println("Average Grade: " + grade);
    }
}
