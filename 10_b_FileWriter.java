import java.io.FileWriter;
import java.io.IOException;
public class FileWriterProgram {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("sample2.txt")) {
            for (char ch = 'A'; ch <= 'Z'; ch++) fw.write(ch);
            System.out.println("Data written to sample2.txt");
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
