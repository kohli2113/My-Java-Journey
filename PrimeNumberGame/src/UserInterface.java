import java.util.Scanner;

public class UserInterface {
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
    //Fill the code here
    System.out.println("Enter the size of first array");
    int s1=sc.nextInt();
    if (s1<=0){
        System.out.println(s1+" is an invalid array size");
        return;
    } 
    int[] arr1=new int[s1];
    System.out.println("Enter the array elements");
    for(int i=0;i<s1;i++){
        arr1[i]=sc.nextInt();
        if(arr1[i]<0){
            System.out.println(arr1[i]+" is an invalid input");
            return;
        }
    }
    
    
    
    System.out.println("Enter the size of second array");
    int s2=sc.nextInt();
    if (s2<=0){
        System.out.println(s2+" is an invalid array size");
        return;
    } 
    if(s2!=s1){
        System.out.println("Both array size is different");
        return;
    }
    int[] arr2=new int[s2];
    System.out.println("Enter the array elements");
    for(int i=0;i<s1;i++){
        arr2[i]=sc.nextInt();
        if(arr2[i]<0){
            System.out.println(arr2[i]+" is an invalid input");
            return;
        }
    }
    
    
    int[] arr3=new int[s1];
    for(int i=0;i<s1;i++){
        arr3[i]=arr2[i]+arr1[i];
    }
    
    int lastDigitSum=0;
    for(int v:arr3){
        lastDigitSum+=v%10;
    }
    if(isPrime(lastDigitSum)){
        System.out.println(lastDigitSum+" is a prime number");
    }else{
        System.out.println(lastDigitSum+" is not a prime number");
    }
    
	}
	static boolean isPrime(int n){
	    if(n<=1){
	        return false;
	    }
	    for(int i=2;i<n;i++){
	        if(n%i==0){
	            return false;
	        }
	    }
	    return true;
	}


}