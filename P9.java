//Write a JAVA program to calculate sum of digits of a number. 
class p9{
  public static void main(String args[]){
    int n=1123;
    int sum=0;
    int d=0;
    while(n!=0){
      d=n%10;
      sum=sum+d;
      n=n/10;
    }
    System.out.println(sum);
  }
}