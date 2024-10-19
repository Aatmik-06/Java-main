
//Anonymous Class = class without any name
//means changing behaviour of Animal class or over writing an class
class Animal{
    void speak(){
        System.out.println("Animal Speak");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
//here we have created an class without any name
//        we have created an class for dog
        Animal dog = new Animal(){
         void speak (){
             System.out.println("Dogs bark");
         }
        };
//        Calling anonymous class
        dog.speak();


//here we have created an class without any name
//        we have created an class for cat
        Animal cat = new Animal(){
            @Override
            void speak() {
                System.out.println("Cat meow");

            }
        };
        cat.speak();

//        if we donot have to change behaviour of any class and we do not
//        have to make class anonymous class so we will use final keyword in front of class
//        or if we have to restrict any class we can use final
//        Examlple

//        Final class Animal{
//            void speak(){
//                System.out.println("Animal Speak");
//            }
//        }

    }
}

