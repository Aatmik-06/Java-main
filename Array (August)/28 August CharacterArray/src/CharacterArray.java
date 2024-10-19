import java.util.Scanner;

public class CharacterArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [] array = new char[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a Vovel");
            array[i] = scanner.next().charAt(0);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
