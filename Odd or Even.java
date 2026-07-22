import java.io.*;
import java.util.*;
public class oddoreven{
  public static void main(String[] arg){
    Scanner sc=new Scanner(System.in);
     int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }

        sc.close();
    }
}