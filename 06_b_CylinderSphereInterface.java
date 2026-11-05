import java.util.Scanner;
public class CylinderSphereInterface {
    interface Shape { double area(int r); }
    interface CylinderShape { double volume(int r, int h); }
    static class Cylinder implements CylinderShape {
        public double volume(int r, int h) { return 3.14 * r * r * h; }
    }
    static class Sphere implements Shape {
        public double area(int r) { return 4.0 / 3.0 * 3.14 * r * r * r; }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius and height: ");
        int r = sc.nextInt(), h = sc.nextInt();
        System.out.println("Volume of Cylinder: " + new Cylinder().volume(r,h));
        System.out.println("Volume of Sphere: " + new Sphere().area(r));
    }
}
