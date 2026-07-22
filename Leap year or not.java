import java.io.*;
import java.util.*;
public class year{
  public static void main(String[] arg){
    Scanner sc=new Scanner(System.in);
     int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");

            int next = year + 1;

            while (!((next % 400 == 0) || (next % 4 == 0 && next % 100 != 0))) {
                next++;
            }

            System.out.println("Years left: " + (next - year));
        }

        sc.close();
    }
}