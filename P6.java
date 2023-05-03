//Write a JAVA program to find first and last digit of a number. 
class p6{
  public static void main(String args[]){
    int n=7645;
    int f=n;
    int l=n%10;
    for(int i=n;i!=0;i=i/10){
      f=i;
    }
    System.out.println("First digit is:" +f);
     System.out.println("last digit is:" +l);
  }
}