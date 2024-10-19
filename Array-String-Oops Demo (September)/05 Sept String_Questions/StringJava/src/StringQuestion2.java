public class StringQuestion2 {
    public static void main(String[] args){
//        Wap to count the occurrence of given character in string
        String name ="Java ka baba";
        char same = 'a';
         int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == same){
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
