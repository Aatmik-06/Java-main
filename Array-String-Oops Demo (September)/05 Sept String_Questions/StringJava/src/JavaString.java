public class JavaString {
    public static void main(String[] args) {
//        printing each character of string
//        0 1 2 3 4 5
//        A a t m i k

//       taking one character from string
        String name = "Aatmik";
        for (int i = 0; i < name.length(); i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < name.length(); i++) {
            char namecharacter = name.charAt(i);
            System.out.print(namecharacter);
            if(i!=name.length()-1){
                System.out.print(",");
            }
        }
    }
}
