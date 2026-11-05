import java.util.Scanner;
public class Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int count = 0;
        System.out.println("Substrings of \"" + s + "\":");
        for (int i = 0; i < s.length(); i++)
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
                count++;
            }
        System.out.println("Number of substrings: " + count);
    }
}
