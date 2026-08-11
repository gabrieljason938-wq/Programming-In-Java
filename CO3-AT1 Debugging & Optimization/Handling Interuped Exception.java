public class A extends Thread {

    public void run() {
        System.out.println("Thread A is Running");
    }

    public static void main(String args[]) {
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}

class B extends Thread {

    public void run() {
        System.out.println("Thread B is Running");
    }
}