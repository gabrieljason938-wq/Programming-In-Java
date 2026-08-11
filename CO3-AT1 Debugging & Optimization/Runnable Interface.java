public class Q8 {
    public static void main(String args[]) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("Completed");
    }
}