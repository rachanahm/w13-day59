//Write a JAVA program to find sum of all odd numbers between 1 to n.
class p3{
  public static void main(String args[]){
    int n=5;
    int sum=0;
    for(int i=1;i<=n;i++){
      if(i%2==1){
        sum=sum+i;
      }
    }
    System.out.print("sum of odd numbers are to:"+ sum);
  }
}