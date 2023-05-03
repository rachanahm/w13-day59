//Write a JAVA program to find sum of all natural numbers between 1 to n. 
class p1{
  public static void main(String args[]){
    int n=20;
    int sum=0;
    for(int i=1;i<=n;i++){
      sum=sum+i;
    }
    System.out.print("sum of natural numbers are to:"+ sum);
  }
}