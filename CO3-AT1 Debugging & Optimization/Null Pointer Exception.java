public class Q4 {
    public static void main(String args[]) {
        String str = "12A";

        try {
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }
    }
}