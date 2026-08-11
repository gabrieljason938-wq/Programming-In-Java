public class Q5 {
    public static void main(String args[]) {
        try {
            int x = 10 / 0;
        }
        catch (Exception e) {
            System.out.println("Error");
        }
        finally {
            System.out.println("Finally block is executed.");
        }
    }
}