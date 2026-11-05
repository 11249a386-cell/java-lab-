import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt(), sum = 0;
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0) sum += i;
        if (n > 1 && sum == n) System.out.println("Given number is Perfect");
        else System.out.println("Given number is not Perfect");
    }
}
