import javax.swing.*;

class Employee{
//    Attributes = information about the class
    String name;
    String address;
    String email ;
    double salary;
    void setDetails()
    {
        // We can use jOptionPane for Graphics user interface(GUI)
     name = JOptionPane.showInputDialog("Enter employee name");
     address = JOptionPane.showInputDialog("Enter employee address");
     email = JOptionPane.showInputDialog("Enter employee email");
//     String is converted into Double
     salary = Double.parseDouble(JOptionPane.showInputDialog("Enter employee salary"));
    }
//    Method is defined
    void displayDetails(){
        JOptionPane.showMessageDialog(null,"Employee Name = "+name);
        JOptionPane.showMessageDialog(null,"Employee Address = "+address);
        JOptionPane.showMessageDialog(null,"Employee Email = "+email);
        JOptionPane.showMessageDialog(null,"Employee Salary = "+salary);
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setDetails();
        emp.displayDetails();
    }
}
