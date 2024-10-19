import java.util.Scanner;

public class StringQuestion3 {
    public static void main(String[] args) {
//        WAP to print the last index of given character int the string
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String");
        String input = scanner.nextLine();

        System.out.println("Enter character to find");
        char toFind = scanner.next().charAt(0);
        int lastIndex = 0;
        for (int i = 0; i < input.length(); i++) {
            if (toFind == input.charAt(i)){
                System.out.println("index of given char = " + i);
                lastIndex = i;
            }
        }
        System.out.println("lastIndex = " + lastIndex);
    }
}
