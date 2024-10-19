public class StringQuestion {
    public static void main(String[] args) {
//        WAP to check weather the given character is present in given string
        String input = "Java Ka Baba";
        char search = 'a';
        boolean flag = false;
        for (int i = 0; i < input.length(); i++) {

            if (search == input.charAt(i)){
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Found");
        }else{
            System.out.println("not found");
        }


    }
}

