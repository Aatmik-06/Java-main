import java.util.Scanner;
//Write a program to print all the numbers divisible by 5, from 1 to 100.
//Sample output
//5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100
public class DivisibleByFive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         int number = 1;

         do {
             if (number % 5 == 0) {
                 System.out.println(number);
             }
             number++;
         }while (number<=100);
    }
}
