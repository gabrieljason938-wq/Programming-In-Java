import java.io.*;
import java.util.*;
public class pattern{
  public static void main(String[] arg){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(i);
      }
      System.out.println(" ");
    }
  }
}