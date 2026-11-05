import java.util.Scanner;
public class ArithmeticPackages {
    static class Add { void addop(int a, int b) { System.out.println("Add: " + (a + b)); } }
    static class Sub { void subop(int a, int b) { System.out.println("Sub: " + (a - b)); } }
    static class Mul { void mulop(int a, int b) { System.out.println("Mul: " + (a * b)); } }
    static class Div { void divop(int a, int b) {
        if (b == 0) System.out.println("Division by zero is not allowed");
        else System.out.println("Div: " + (a / b));
    } }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        new Add().addop(a, b); new Sub().subop(a, b);
        new Mul().mulop(a, b); new Div().divop(a, b);
    }
}
