import java.util.Arrays;

public class AnagramtwoString {
   public static void main (String args[]){
    String str1="race";
    String str2="care";
if((str1.length())==(str2.length())){
    char[] charArray1=str1.toCharArray();
     char[] charArray2=str2.toCharArray();
     Arrays.sort(charArray1);
     Arrays.sort(charArray2);

     boolean result=Arrays.equals(charArray1, charArray2);
     if(result){
        System.out.println("they are anagram of each other");
     }
     else{
        System.out.println("not anagram");
     }
   } 
    else{
   System.out.println("not anagram");
   }
}
}
