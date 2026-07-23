import java.io.*;
import java.util.*;
public class Prime{
  public static void main(String[] arg){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int count=0;

    for(int i=1;i<=num;i++){
      if(num%i==0)
        count++;
    }
    if(count==2)
      System.out.println("Prime NUmber");
    else
      System.out.println("Composite number");
  }
}