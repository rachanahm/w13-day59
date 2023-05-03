//Write a JAVA program to print multiplication table of any number. 
import java.util.Scanner;
class p4{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a table which you want to print:");
    int n=sc.nextInt();
    for(int i=1;i<=10;i++){
      System.out.println(n+ "x" +i+ "=" +(n*i));
    }
  }
}
