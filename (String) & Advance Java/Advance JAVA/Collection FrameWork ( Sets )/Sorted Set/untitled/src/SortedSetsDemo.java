import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetsDemo {
    public static void main(String[] args) {
        SortedSet st = new TreeSet();
        st.add(45);
        st.add(05);
        st.add(78);
        st.add(405);
        st.add(4785);
//        data will come in sorted order
        System.out.println("st = " + st);

        System.out.println("First data = "+st.first());

        System.out.println("Last Data = "+st.last());

        SortedSet st2 = st.tailSet(45) ;

        System.out.println("st2 = " + st2);

//        it will print data btw given values
        SortedSet st3 = st.subSet(2,80);

        System.out.println("st3 = " + st3);







    }
}
