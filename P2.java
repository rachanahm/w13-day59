//Write a JAVA program to find sum of all even numbers between 1 to n. 
class p2{
  public static void main(String args[]){
    int n=20;
    int sum=0;
    for(int i=1;i<=n;i++){
      if(i%2==0){
        sum=sum+i;
      }
    }
    System.out.print("sum of even numbers are to:"+ sum);
  }
}