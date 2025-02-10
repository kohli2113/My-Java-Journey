import java.util.*;
public class FibonacciiSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements:");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        fibo(a,b,n);
    }
    static void fibo(int a, int b, int n){
        int c=a+b;
        if(n==0){
            return;
        }
        else {
            System.out.println(a);
            System.out.println(b);
            fibo(b,c,n-1);
        }
    }
}
