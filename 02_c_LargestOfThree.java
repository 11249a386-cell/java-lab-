import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        if (x >= y && x >= z) System.out.println("Largest number: " + x);
        else if (y >= x && y >= z) System.out.println("Largest number: " + y);
        else System.out.println("Largest number: " + z);
    }
}
