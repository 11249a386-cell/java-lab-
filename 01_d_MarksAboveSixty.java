import java.util.Scanner;
public class MarksAboveSixty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[6];
        int[] marks = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter student name and marks: ");
            names[i] = sc.next();
            marks[i] = sc.nextInt();
        }
        System.out.println("Students scoring 60 or above:");
        for (int i = 0; i < 6; i++)
            if (marks[i] >= 60) System.out.println(names[i] + " " + marks[i]);
    }
}
