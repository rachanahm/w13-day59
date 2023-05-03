//Write a JAVA program to check whether a number is palindrome or not. 
class p8{
  public static void main(String args[]){
    int num=101;
    int rev=0;
    for(int i=num;i!=0;i=i/10){
      rev=rev*10+i%10;
    }
    if(rev==num){
      System.out.println("palindrome");
    }
    else{
       System.out.println(" not palindrome");
    }
  }
}