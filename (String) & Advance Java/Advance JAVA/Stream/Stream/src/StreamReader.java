import java.io.*;

//Reading data
public class StreamReader {
    public static void main(String[] args) {
//        Reading data but it is encrypted so we will see encrypted data
        File f = new File("D:\\JAVA (Basic-Main)\\(String) & Advance Java\\Advance JAVA\\Stream\\StreamWritingOutput.txt");
        try{
            FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bis =new BufferedInputStream(fis);
//            We can also skip buffered input stream
            DataInputStream dis = new DataInputStream(fis);
//            reading data but in byte format or encrypted
//            String st ;
//            while (((st=dis.readLine())!=null)){
//                System.out.println("Reading Data = " + st);
//            }

//            Reading data and decoding data as well as
            String s1 =  dis.readUTF(); // reading characters and strings
            double d1 = dis.readDouble(); // reading double
            boolean b1 = dis.readBoolean(); // reading boolean
            String s2 =  dis.readUTF();
            System.out.println("Readed data = " + s1);
            System.out.println("Readed data = " + d1);
            System.out.println("Readed data = " + b1);
            System.out.println("Readed data = " + s2);
            dis.close();
            fis.close();
            bis.close();
        } catch (IOException ei) {
            System.out.println("exception = " + ei);
        }
    }
}
