import java.io.*;

//        Writing data using Stream
// Using file output stream
public class StreamWritingDemo {
    public static void main(String[] args) {
        File f = new File("D:\\JAVA (Basic-Main)\\(String) & Advance Java\\Advance JAVA\\Stream\\StreamWritingOutput.txt");
        try{
            FileOutputStream fos = new FileOutputStream(f);
            BufferedOutputStream bos =  new BufferedOutputStream(fos);
//            in fileOutput and bufferedOutput Stream there are only few methods
//            to write data and only we have to give data in byte format
//            DataOutputStream is very advance and used nowadays
            DataOutputStream dos = new DataOutputStream(bos);
            dos.writeChars("Hello Java");
            dos.writeDouble(24.54);
            dos.writeBoolean(true);
            dos.writeChars("Finished");
            dos.close();
            bos.close();
            fos.close();
//            data will be in  byte form
//            so data will be accessed in encrypted format and
//            no one can access our data and string will not be encrypted String will be in normal form
//            can see output in D:\JAVA (Basic-Main)\(String) & Advance Java\Advance JAVA\Stream\StreamWriting.txt
        } catch (IOException e) {
            System.out.println("e = " + e);
        }
    }
}
