public class ReversethrDigits {
    public static void main(String args[]){
        int number=123,rem=0,rev=0;
        while(number>0){
            rem=number%10;
            rev=rev*10+rem;
            number=number/10;

        }
        System.out.println("reverse the digit "+rev);
    }
}
