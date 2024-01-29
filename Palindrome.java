public class Palindrome {
    public static void main(String args[]){
   //   String word="asdsa";
   //   String org=word;
   //   String reverse="";
   //   int n=word.length();
   //   for (int i=n-1;i>=0;i--){
   //      reverse=reverse+word.charAt(i);
   //   }
     
   //   if (org.equals(reverse)){
   //      System.out.println("palinrome");
   //   }
   //   else{
   //      System.out.println("not a palindrome");
   //   }
   int arr[]={1,0,2,0,1};
   
   int j=0;
   for(int i=0;i<5;i++){
      if(arr[i]!=0)
     { arr[j++]=arr[i];}
   }
   while(j<5){
      arr[j++]=0;
      
   }
   for(int i=0;i<5;i++){
   System.out.println(arr[i]);
   }
}
}
