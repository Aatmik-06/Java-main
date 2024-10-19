//there are 5 types of inheritance
//1. Single inheritance
//2. Multiple inheritance
//3. Multi Level inheritance
//4. Hybrid inheritance  to implement it we use interface
//5.

//java supports main 3 types and to use 2 more we use interface

//making Single inheritance
//Advantage of Inheritance is reusability
class Parent{
    void showInfo(){
        System.out.println("Parent class show info");
    }
}
//extend keyword is used to make child class so this child will contains information of parent class and of main object class
class Child extends Parent{
//    if we have to change the behaviour of child class so we override the showInfo or redefining showInfo
    @Override
    void showInfo() {
//        if we have to use parent showInfo also so we can use super keyword
        super.showInfo();
//        redefining parent showInfo in child
        System.out.println("Hello I am Child");
    }
}
//Making Multiple Level Inheritance
//another example
class Animal{
    void Speak(){
        System.out.println("Animal Speak");
    }
}
class Dog extends Animal{
    @Override
    void Speak() {
        System.out.println("Dogs Bark");
    }
}

class BullDog extends Dog{

}

public class Inheretence {
    public static void main(String[] args) {
        Parent obj = new Parent();
        System.out.println(obj.toString());
//        object class is parent class of all classes
        Child child = new Child();
        child.showInfo();
//      making bulldog object
        BullDog bldog = new BullDog();

        bldog.Speak();

    }
}
