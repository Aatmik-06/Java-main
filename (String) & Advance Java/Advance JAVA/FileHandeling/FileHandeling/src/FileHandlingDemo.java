import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//We have to use java IO Package
// Inside Java IO Package there are some classes
// File class
// File Writer
// Print Writer
// File Reader
// Buffered Reader
// File Input Stream

public class FileHandlingDemo {
    public static void main(String[] args) {

        File f = new File("d:\\Test.txt");
//        We have created a file in d drive
        if (!f.exists()){
            try {
                //        We have created a file in d drive
                f.createNewFile();
                JOptionPane.showMessageDialog(null,"File Created");

            }
            catch (IOException ex){
                System.out.println("ex");
            }
            System.out.println(f.getAbsoluteFile());
            System.out.println(f.getAbsolutePath());
        }
        //                now we have to write data in that file
        try {
//            we have to use true so append will get activated
            FileWriter fw = new FileWriter(f ,true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("kfkmkdfmk");
            pw.println(545454545);
            pw.println(true);
            pw.println("Hello");
            pw.println(454878);
//            if we add new data so this data will get deleted because write mode will work
//            and we have to use append mode
            pw.close();
            fw.close();
            JOptionPane.showMessageDialog(null,"Data Written in File ");
        }catch (IOException ex1){
            System.out.println(ex1);

        }

    }
}
