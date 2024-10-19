
//Equals Method

import java.util.Objects;

//equals() method will compare data and reference
// == will compare only reference

class Equals{
    private int sid;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return getClass().getName()+" "+hashCode();
    }

    @Override
    public int hashCode() {
        return sid;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Equals)
        {
            Equals e =(Equals)obj;
            if(sid == e.sid)
            {
                return true;
            }
        }

        return false;
    }
}
public class ObjectEquals {
    public static void main(String []str)
    {
        Equals h1 = new Equals();
        h1.setSid(111);
        System.out.println("Class name and hashCode = "+h1);
        System.out.println("hashCode = "+h1.hashCode());
        System.out.println();


        Equals e2 = new Equals();
        e2.setSid(111);
//        it will compare reference
        System.out.println("Reference Compared = "+(h1==e2));
//        it will compare data
        System.out.println("Data Compared = "+h1.equals(e2));

    }
}