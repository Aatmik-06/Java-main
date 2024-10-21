class test {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof test) {
            test e = (test) obj;
            if (id == e.id) {
                return true;
            }
        }
        return false;
    }
}
public class Equals1 {
    public static void main(String[] args) {
        test obj = new test();
        obj.setId(111);

        test obj1 = new test();
        obj1.setId(111);
//        so this will compare references
        System.out.println("== Operator used = "+(obj==obj1));

//        this will compare data because we have override equals class
        System.out.println("equals overrided method used = "+obj.equals(obj1));
    }
}
