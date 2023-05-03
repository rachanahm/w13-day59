//Write a JAVA program to find sum of first and last digit of a number. 
class p7{
  public static void main(String args[]){
    int n=7645;
    int f=n;
    int l=n%10;
    int sum=0;
    for(int i=n;i!=0;i=i/10){
      f=i;
      sum=f+l;
    }
    System.out.println("First digit is:" +sum);
  }
}