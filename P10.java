//Write a JAVA program to calculate product of digits of a number. 
class p10{
  public static void main(String args[]){
    int n=123;
    int d=0;
    int p=1;
    while(n>0){
      d=n%10;
      p=p*d;
      n=n/10;
    }
    System.out.println(p);
  }
}