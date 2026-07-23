import java.io.*;
import java.util.*;
public class Happy{
  public static void main(String[] arg){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int temp=n;
    
    while(temp!=1&&temp!=4){
      int sum=0;
      while(temp>0){
        int dig=temp%10;
        sum=sum+(dig*dig);
        temp=temp/10;
      }
      temp=sum;
    }
    if(temp==1)
    System.out.println("Happy Number");
    else
    System.out.println("Not happy Number");
  }
}