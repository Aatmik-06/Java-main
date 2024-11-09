//Exception
//java.lang.throuoable is an package in which exception class is present
//
//Exception Handler is used to handle exception
//types of exception handler
// 1. try
// 2. catch
// 3. throw
// 4. throws
// 5. finally

import javax.swing.*;

public class Exception {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please Enter Name");
//        using Exception Handler try and catch because when we click on cancel so an
        try {
            int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age"));
            if (age < 0) {
                System.err.println("Invalid Age");
            }
            if (name.length() < 3) {
                System.err.println("invalid Name");
            } else {
                JOptionPane.showMessageDialog(null, "Hello" + " " + name);
            }
        }
//        here we have created an object of NullPointerException which is - ex
//        this catch is used for String Name when we click on cancel
        catch (NullPointerException ex)
        {
            JOptionPane.showMessageDialog(null ,"String Cannot be null!!!"+"      "+ex);
        }
        //        we can use multiple catch blocks
//        this catch is used for age
        catch (NumberFormatException ex1){
            JOptionPane.showMessageDialog(null,"Age Must Be in Number");
        }
//        code is not executing when we are not using exception handler try and catch
//        now code will execute after error also because we have used try and catch because we have used exception handler try and catch
//        now code execution will not stop after exception because we have used exception handler try and catch
        JOptionPane.showMessageDialog(null,"Process Over");






    }
}
