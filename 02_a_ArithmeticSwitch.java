import java.util.Scanner;
public class ArithmeticSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter two numbers: ");
            int x = sc.nextInt(), y = sc.nextInt();
            System.out.println("1.Add  2.Subtract  3.Multiply  4.Divide  5.Modulus  6.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: System.out.println("Result: " + (x + y)); break;
                case 2: System.out.println("Result: " + (x - y)); break;
                case 3: System.out.println("Result: " + (x * y)); break;
                case 4:
                    if (y == 0) System.out.println("Cannot divide by zero");
                    else System.out.println("Result: " + ((double)x / y));
                    break;
                case 5:
                    if (y == 0) System.out.println("Cannot divide by zero");
                    else System.out.println("Result: " + (x % y));
                    break;
                case 6: return;
                default: System.out.println("Invalid choice");
            }
        }
    }
}
