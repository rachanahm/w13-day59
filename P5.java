//Write a JAVA program to count number of digits in a number.
class p5{
  public static void main(String args[]){
    int n=456;
    int count=0;
    //while(n!=0){
    //n=n/10;
    for(int i=n;i!=0;i=i/10){
      count++;
    }
    System.out.println(count);
  }
}