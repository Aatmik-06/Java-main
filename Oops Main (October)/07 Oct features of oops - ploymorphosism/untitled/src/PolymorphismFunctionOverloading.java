//polymorphism
//there are two types of polymorphism
//1. static  or overloading means same name with different arguments
//there are two types of overloading 1.function 2.constructor
//2. Dynamic


//static polymorphism
//function overloading
//here we are using same function and giving different arguments

class Message {
    public void showMessage(){
        System.out.println("Hello World");
    }
    public void showMeaasge(String msg){
        System.out.println("Message:"+msg);
    }
    public void showMessage(int id, String msg){
        System.out.println("id: "+id);
        System.out.println("Message:"+msg);
    }
    public void showMessage(String sub,String msg){
        System.out.println("Subject:"+sub);
        System.out.println("message:"+msg);
    }
}

public class PolymorphismFunctionOverloading {
    public static void main(String[] args) {

        Message ms = new Message();

        ms.showMessage();
        ms.showMeaasge("testing function overloading");
        ms.showMessage(505,"Id Message");
        ms.showMessage("Email","adi@gmail.com");
    }
}
