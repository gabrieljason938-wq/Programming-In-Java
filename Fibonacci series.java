import java.io.*;
import java.util.*;
public class LCMGCD{
  public static void main(String[] arg){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=0,b=1;
    System.out.println("Fibonacci series:");
    for(int i=1;i<=n;i++){
      System.out.print(a+" ");
      int c=a+b;
      a=b;
      b=c;
    }
  }