public class Demo extends Thread {

    public void run() {
        System.out.println("Running");
    }

    public static void main(String args[]) {
        Demo d = new Demo();
        d.start();
    }
}