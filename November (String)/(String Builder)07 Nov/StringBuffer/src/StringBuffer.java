public class StringBuffer {
    public static void main(String[] args) {
        String st =new String("Hello");
        String st2 = new String("Hello");
        //        hashcode is Same
//        so it will print false because it will compare references
//        and it will compare data from heap

        System.out.println("== Comparison = " + (st==st2));
//        now using equals method
//        then it will compare data
        System.out.println("Equals Comparison = "+st.equals(st2));

        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb1 = new StringBuilder("Hello");
//        hashcode is different
        System.out.println(sb.hashCode());
        System.out.println(sb1.hashCode());
//        in String Builder reference is compared in Equals method
        System.out.println(sb.equals(sb1));



        //        when we change string in runtime so its reference will change
//        so setter and getter is not used in sting
//        So we cannot change data of String it is Constant  we have to create new object
        String msg =new String("Hello");
//        new object is created below
        msg = msg.concat(" Java");
        System.out.println("msg = " + msg);
//        if we have to change data many times so we will use stringBuilder because String will create many objects so it is not used
//        We can use StringBuilder

//        Append method is used in StringBuilder
        sb.append(" Java");
//        So in StringBuilder new Object is not created so we use StringBuilder
//        stringBuilder is more Advance than String
//        if we use Loop many times to it increases time complexicity so we have to not use Loops Many times

//        Reversing a Data in String Builder
//        .reverse() is an method used in StringBuilder
//        Check Palindrome name 
          String rev = new StringBuilder("naman").reverse().toString();
          String rev1 = new StringBuilder("naman").toString();
        System.out.println("reverse String = " + rev);
        if (rev.equals(rev1.toString()))
        {
            System.out.println("Palindrome");
        }
    }
}
