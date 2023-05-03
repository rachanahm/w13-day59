//Write a JAVA program to enter a number and print its reverse. 
class p11{
  public static void main(String args[]){
    int num=123;
    int rev=0;
    int count=0;
    while(num>0){
      rev=rev*10+num%10;
      num/=10;
      count++;
    }
    System.out.println(rev);
  }
}