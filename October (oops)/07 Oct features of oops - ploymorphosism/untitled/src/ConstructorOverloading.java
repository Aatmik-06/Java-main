
//Constructor Overloading
//We have to change default constructor in constructor overloading
//used to change object
//we have to use same name and different arguments

import javax.swing.*;

class Department{
    int dept_id;
    String dept_name;
    String dept_head;
//    making an default constructor
    public Department(){
        dept_id=0;
        dept_name=null;
        dept_head=null;
    }
//    making an method to print
    public void print(){
        System.out.println("dept_id = " + dept_id);
        System.out.println("dept_name = " + dept_name);
        System.out.println("dept_head = " + dept_head);
    }
//    Overloading a constructor
    public Department(int dept_id,String dept_name){
        this.dept_id=dept_id;
        this.dept_name=dept_name;
    }

//    Again overloading
    public Department(int dept_id,String dept_name,String dept_head){
        this.dept_id=dept_id;
        this.dept_name=dept_name;
        this.dept_head=dept_head;
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {

        int id =Integer.parseInt(JOptionPane.showInputDialog("Please Enter ID:"));
        String name = JOptionPane.showInputDialog("Please Enter Name:");
        String head = JOptionPane.showInputDialog("Please Enter Dept Head:");


        Department CS = new Department();
        CS.print();
        System.out.println("---------------------");

        Department IT = new Department(id,name);
        IT.print();
        System.out.println("---------------------");

        Department AI = new Department(id,name,head);
        AI.print();

    }
}
