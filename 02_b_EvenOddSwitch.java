import java.util.Scanner;
public class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        switch (Math.abs(n % 2)) {
            case 0: System.out.println("This number is even"); break;
            case 1: System.out.println("This number is odd"); break;
        }
    }
}
