
// Stream means byte
// there are two streams
// Input Streams
// Output Streams
// both are interfaces

//Input Stream Implementation class
// 1. File Input Stream
// 2. Buffered Input Stream
// 3. Data Input Stream

//Output Streams Implements class
// 1. File Output Stream
// 2. Buffered Output Stream
// 3. Data Output Stream

// Scanner also works as an file reader we can give file name in the place of scanner.file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StreamDemo {
    public static void main(String[] args) {
// Scanner also works as an file reader we can give file name in the place of scanner.file
        File f = new File("d:\\Test.txt");
//        Here we are taking data from file using scanner
        try {
            Scanner sc = new Scanner(f);
            String data;
            while (sc.hasNextLine()){
                data = sc.nextLine();
                System.out.println("File Data = " + data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }




    }
}
