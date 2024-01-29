import java.util.Scanner;

public class SumofArray{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int n=7;
        int a[]=new int[n];
        System.out.println("enter the numbers to be sum");
        for (int i=0;i<n;i++){
            a[i]=inp.nextInt();

        }
int sum=0;
       for (int i=0;i<n;i++){
            sum=sum+a[i];

        }
     System.out.println("sum is "+sum);   
    }
}