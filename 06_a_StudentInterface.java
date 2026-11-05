public class StudentInterface {
    interface Exam { void percentCal(); }
    static class Student {
        String name; int rollNo, mark1, mark2;
        Student(String n, int r, int m1, int m2) {
            name=n; rollNo=r; mark1=m1; mark2=m2;
        }
        void display() {
            System.out.println("Name of Student: " + name);
            System.out.println("Roll No. of Student: " + rollNo);
            System.out.println("Marks of Subject 1: " + mark1);
            System.out.println("Marks of Subject 2: " + mark2);
        }
    }
    static class Result extends Student implements Exam {
        Result(String n, int r, int m1, int m2) { super(n,r,m1,m2); }
        public void percentCal() {
            float percent = (mark1 + mark2) * 100.0f / 200;
            System.out.println("Percentage: " + percent + "%");
        }
    }
    public static void main(String[] args) {
        Result r = new Result("Ragini", 12, 93, 84);
        r.display(); r.percentCal();
    }
}
