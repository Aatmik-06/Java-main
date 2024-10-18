import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String input = "Aatmik a";
//      to get the length of string
        int length = input.length();
//
        char firstCharacter = input.charAt(0);
//
//
        int indexOfCharA = input.indexOf('a');
        int indexOfCharZ = input.indexOf('z');
//
        int indexOfCharFromGivenIndex = input.indexOf('a',2);

        System.out.println("indexOfCharA = " + indexOfCharA);
        System.out.println("indexOfCharFromGivenIndex = " + indexOfCharFromGivenIndex);
        int indexOfMI = input.indexOf("mi");
        System.out.println("indexOfTM = " + indexOfMI);
        int lastIndexOfK = input.lastIndexOf('k');
        System.out.println("lastIndex = " + lastIndexOfK);

        String inputUpperCase = input.toUpperCase();
        String inputLowerCase = input.toLowerCase();
        System.out.println("inputLowerCase = " + inputLowerCase);
        System.out.println("inputUpperCase = " + inputUpperCase);
        String value1= "Aatmik a";
        if (input.equals(value1)){
            System.out.println("Same");
        }else {
            System.out.println("Different");
        }
        if(inputLowerCase.equalsIgnoreCase(inputUpperCase)){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }

    }
}
