public class ThreadPriority {
    static class A extends Thread {
        public void run() {
            System.out.println("Thread A started");
            for(int i=1;i<=4;i++) System.out.println("from thread A i=" + i);
            System.out.println("exit from A");
        }
    }
    static class B extends Thread {
        public void run() {
            System.out.println("Thread B started");
            for(int j=1;j<=4;j++) System.out.println("from thread B j=" + j);
            System.out.println("exit from B");
        }
    }
    static class C extends Thread {
        public void run() {
            System.out.println("Thread C started");
            for(int k=1;k<=4;k++) System.out.println("thread C =" + k);
            System.out.println("exit from C");
        }
    }
    public static void main(String[] args) {
        A a=new A(); B b=new B(); C c=new C();
        c.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(Thread.NORM_PRIORITY);
        a.setPriority(Thread.MIN_PRIORITY);
        a.start(); b.start(); c.start();
        System.out.println("End of main thread");
    }
}
