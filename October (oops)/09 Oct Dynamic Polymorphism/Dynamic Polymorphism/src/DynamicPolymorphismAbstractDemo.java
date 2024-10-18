//Dynamic Polymorphism
//means changing behaviour in runtime

//First we have to make abstract class
//inside which we have to create abstract method

//then making implementaion class of that abstract
//implementation class will overwrite abstract class

import javax.swing.*;

abstract class Employee{
    abstract double calculateSalary();
}
class Manager extends Employee{
//    now we are redefining calculateSalary by using Overriding
    @Override
    double calculateSalary() {
        double salary = Integer.parseInt(JOptionPane.showInputDialog("Enter Basic Salary of Employee"));
        double ta = (salary*10)/100;
        double pf = (salary*12)/100;
        double net_salary= (salary+ta)-pf;
        return net_salary;
    }
}

class Accountant extends Employee{
//  now again we are redefining calculateSalary by using Overriding
    @Override
    double calculateSalary() {
        double salary = Integer.parseInt(JOptionPane.showInputDialog("Enter Basic Salary of Accountant"));
        double ta = (salary*5)/100;
        double pf = (salary*12)/100;
        double net_salary= (salary+ta)-pf;
        return net_salary;
    }
}

//means this code will run different in employee and different in Accountant
// so it is called dynamic

public class DynamicPolymorphismAbstractDemo {
    public static void main(String[] args) {

        Employee obj = new Manager();

        double ManagerSalary = obj.calculateSalary();
        System.out.println("Manager Salary = " + ManagerSalary);

        obj = new Accountant();

        double AccountantSalary = obj.calculateSalary();
        System.out.println("Accountant Salary = " + AccountantSalary);



//        now we are changing behaviour in runtime so it is called dynamic ploymorphism

    }
}
