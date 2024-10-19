
//        Features of oops
//        Abstraction
//        Encapsulation
//        polymorphism
//        Inheretence

//        Abstraction  and encapsulation is used to show and hide some information
//        encapsulation will hide data
//        Abstraction is used to show data

//        Encapsulation
//        we have to use modifier to hide data

//        there are 4 modifiers
//        public
//        private
//        Protected
//        Default

//        we will use private in encapsulation

//        we have to use get and set in java or accessor and mutator

//        so
// we have use both abstraction and encapsulation here

class Acount{

//hiding so private variable = balance
private double balance;

//getting balance is returning value
public double getBalance() {
    return balance;
}
//setting balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class FeaturesOfOopsAbsEnc {
    public static void main(String[] args) {

       Acount ac = new Acount();
//       we cannot use balance directly because it is encapsulated it is secured it is private
       ac.setBalance(45000);
        System.out.println("Balance = " +ac.getBalance());
    }
}
//Access label default is used 
