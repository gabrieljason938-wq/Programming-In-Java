import java.io.*;
import java.util.*;
public class LCMGCD{
  public static void main(String[] arg){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();

    int x=a,y=b;
    while(y!=0){
      int temp=y;
      y=x%y;
      x=temp;
    }
    int gcd=x;
    int lcm=(a*b)/gcd;
    
    System.out.println("GCD=" +gcd);
    System.out.println("LCM= "+lcm);
  }
}