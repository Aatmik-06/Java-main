import java.io.*;

//Reading data
public class StreamReader {
    public static void main(String[] args) {
//        Reading data but it is encrypted so we will see encrypted data
        File f = new File("D:\\JAVA (Basic-Main)\\(String) & Advance Java\\Advance JAVA\\Stream\\StreamWritingOutput.txt");
        try{
            FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bis =new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);
            String st ;

            while (((st=dis.readLine())!=null)){
                System.out.println("Reading Data = " + st);
            }
            dis.close();
            fis.close();
            bis.close();
        } catch (IOException ei) {
            System.out.println("exception = " + ei);
        }
    }
}
