import java.io.IOException;

public class ProcessBuilderDemo {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("C:\\Windows\\System32\\notepad.exe");
        try {
            pb.start();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
