
//  HashCode
//
class Hash {
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
}
public class ObjectHashCode {
    public static void main(String[] args) {

        Hash h1 = new Hash();
        h1.setSid(1111);
        System.out.println("Class name and hashCode="+h1);
        System.out.println("hashCode="+h1.hashCode());
    }
}


