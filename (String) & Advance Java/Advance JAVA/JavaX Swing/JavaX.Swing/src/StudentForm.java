import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentForm extends JFrame {
    private JPanel main;
    private JLabel enterNameLabel;
    private JTextField textField1;
    private JButton loginButton;
    private JTextField textField2;
    private JTextField textField3;

    public StudentForm() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField1.getText();
                String age = textField2.getText();
                String email = textField3.getText();
                File studentDetails =  new File("d:\\Student.txt");
                try{
                    FileWriter fw = new FileWriter("d:\\Student.txt");
                    PrintWriter pw = new PrintWriter(fw);
                    pw.print(name+" "+age+" "+email+" ");
                    pw.close();
                    fw.close();
                    JOptionPane.showMessageDialog(null , "Data Added in File");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
            }
        });
    }
    public static void main(String[] args) {
        StudentForm st = new StudentForm();
        st.setContentPane(st.main);
        st.setSize(300 , 200);
        st.setVisible(true);
        st.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
