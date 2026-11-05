import java.util.Scanner;
public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Enter text to replace: ");
        String oldText = sc.nextLine();
        System.out.print("Enter replacement text: ");
        String newText = sc.nextLine();
        System.out.println(s.replace(oldText, newText));
    }
}
