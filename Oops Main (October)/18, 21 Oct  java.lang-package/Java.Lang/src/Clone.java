// So Clone method will clone any object but we have to override it
//Clone method is an abstract method so it belongs from Cloneable interface so we have to implement Cloneable
class Test_1 implements Cloneable{
    int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Clone method is an abstract method so it belongs from Cloneable interface so we have to implement Cloneable
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

//Clone method is an abstract method

public class Clone {
    public static void main(String[] args) {
        Test_1 obj = new Test_1();
        obj.setId(222);

//        so here same reference is used for obj and t so we use cloning
//        Test_1 t = obj;
//        t.setId(333);
//        System.out.println("obj = " + obj.getId());
//        System.out.println("t = " + t.getId());

//        so we have to override clone method

        Test_1 t = null;
        try {
//        now we have to convert t object into class
//        or we have to typecast t
            t =(Test_1) obj.clone();
        }
        catch (Exception e){

        }
        t.setId(333);


        System.out.println("obj = " + obj.getId());
        System.out.println("t = " + t.getId());
    }
}
