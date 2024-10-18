import java.util.Scanner;
public class AgeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age>0 && age<=100) {
            if (age > 0 && age <= 12) {
                System.out.println("child");
            }
            if (age >= 13 && age <= 19) {
                System.out.println("Teen");
            }
            if (age >= 20 && age <= 59) {
                System.out.println("Adult");
            }
            if (age >= 60 && age <= 100) {
                System.out.println("Senior");
            }
        }
        else {
            System.out.println("invalid age");
        }
    }
}
