import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Percentage");
        double percentage = scanner.nextDouble();

        if (percentage >=100) {
            if (percentage >= 90) {
                System.out.println("Grade A+");
            } else if (percentage >= 80) {
                System.out.println("Grade A");
            } else if (percentage >= 70) {
                System.out.println("Garde B");
            } else if (percentage >= 60) {
                System.out.println("Garde C");
            } else if (percentage >= 50) {
                System.out.println("Garde D");
            } else if (percentage >= 30) {
                System.out.println("Fail");
            }
        }else {
            System.out.println("invalid Grade");
        }
    }
}
