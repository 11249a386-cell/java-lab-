import java.io.FileReader;
import java.io.IOException;
public class FileReaderProgram {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("sample2.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) System.out.println((char) ch);
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
