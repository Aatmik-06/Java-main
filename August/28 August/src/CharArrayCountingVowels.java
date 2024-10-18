public class CharArrayCountingVowels {
    public static void main(String[] args) {

        char [] array = {'A','a','e','m','i','k'};
        char [] small = {'a','e','i','o','u'};
        int count =0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < small.length; j++) {
                if (array[i] == small[j]) {
                    count++;
                    break;
                }
                if (array[i] >= 'A' && array[i] <='Z'){
                    int capital = array[i]+32;
                    count++;
                    break;
                }
            }
        }
        System.out.println("count = " + count);

    }

}
