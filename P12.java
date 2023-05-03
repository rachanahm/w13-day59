//Write a JAVA program to find frequency of each digit in a given integer
class p12{
  public static void main(String args[]){
    int num=112314;
    int count=0;
    int[] freq=new int[10];
   while(num>0){
     int digit=num%10;
     freq[digit]++;
     num=num/10;
   }
    for(int i=0;i<10;i++){
      if(freq[i]!=0){
    System.out.println( i + "occurs" + freq[i]);
  }
}
}
}
