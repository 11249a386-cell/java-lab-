import java.util.Scanner;
public class ShapePackages {
    static class Circle {
        int r; Circle(int r) { this.r = r; }
        double perimeter() { return 2 * 3.14 * r; }
        double area() { return 3.14 * r * r; }
    }
    static class Square {
        int side; Square(int side) { this.side = side; }
        int perimeter() { return 4 * side; }
        int area() { return side * side; }
    }
    static class Triangle {
        int a, b, c; Triangle(int a, int b, int c) { this.a=a; this.b=b; this.c=c; }
        int perimeter() { return a+b+c; }
        double area() {
            double s = (a+b+c)/2.0;
            return Math.sqrt(s*(s-a)*(s-b)*(s-c));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter square side: ");
        Square sq = new Square(sc.nextInt());
        System.out.println("Perimeter of Square is " + sq.perimeter());
        System.out.println("Area of Square is " + sq.area());
        System.out.print("Enter circle radius: ");
        Circle ci = new Circle(sc.nextInt());
        System.out.println("Perimeter of Circle is " + ci.perimeter());
        System.out.println("Area of Circle is " + ci.area());
        System.out.print("Enter three triangle sides: ");
        Triangle t = new Triangle(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Perimeter of Triangle is " + t.perimeter());
        System.out.println("Area of Triangle is " + t.area());
    }
}
