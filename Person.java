public class Person {
    String name = "John";

    void displayName() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.displayName();
        s.displayRollNo();
    }
}

class Student extends Person {
    int rollNo = 101;

    void displayRollNo() {
        System.out.println("Roll No: " + rollNo);
    }
}