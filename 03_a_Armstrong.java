import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        int n = sc.nextInt(), temp = n, sum = 0;
        int digits = String.valueOf(Math.abs(n)).length();
        while (temp > 0) {
            int rem = temp % 10;
            sum += (int)Math.pow(rem, digits);
            temp /= 10;
        }
        if (n >= 0 && sum == n) System.out.println("Armstrong Number");
        else System.out.println("Not an Armstrong Number");
    }
}
