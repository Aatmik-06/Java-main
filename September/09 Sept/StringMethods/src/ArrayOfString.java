import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfString {
    public static void main(String[] args) {
        // create an array of String
        String[]  nameOfStudents = new String[25];
        System.out.println("Arrays.toString(nameOfStudents) = " + Arrays.toString(nameOfStudents));
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nameOfStudents.length; i++) {
            nameOfStudents[i] = scanner.nextLine();
        }
        System.out.println("Arrays.toString(nameOfStudents) = " + Arrays.toString(nameOfStudents));

        // find the student whose name starts with A
        // startsWith(String prefix) boolean
        for (int i = 0; i < nameOfStudents.length; i++) {

            if((nameOfStudents[i].toLowerCase().startsWith("aa"))){
                System.out.println(nameOfStudents[i]);
            }
        }
        //endsWith(String suffix)
        System.out.println("ends with a");
        for (int i = 0; i < nameOfStudents.length; i++) {
            String temp = nameOfStudents[i].trim();
            if(temp.endsWith("a")){
                System.out.println(temp);
            }
        }
        System.out.println("names containing a");
        // print all the names that contains 'a'
        for (int i = 0; i < nameOfStudents.length; i++) {
            if (nameOfStudents[i].contains("a")) {
                System.out.println(nameOfStudents[i]);
            }
        }
        // print all the student names, whose first names are ending with a

        // split(String regex) -> return an Array of String
        System.out.println("*".repeat(50));
        for (String name : nameOfStudents) {
            // split
            String[] tempSplit = name.split(" ");
            if (tempSplit[0].endsWith("a")) {
                System.out.println(name);
            }
        }
    }
}
