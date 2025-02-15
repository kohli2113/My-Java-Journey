package PrimeNumberGame.src.Jan31;

public class Ques_OnArray {
//Given an array of integers,
//find out all the even numbers exist in the array.
//find out all the numbers starting with 3
//find duplicate elements in a given integers array in java
//Total number of elements
//find the first and last element of the list
//max value, min value

    public static void main(String[] args) {
        int[] arr={34,55,98,12,34,49};

        int max=0;
        int min=0;
        System.out.println("Even values:");
        for(int i:arr){
            //even nums
            if(isEven(i)){
                System.out.println(i);
            }
            //max/min
            if (i>max){
                max=i;
            }
            if (i<min){
                min=i;
            }
        }
        System.out.println("Maximum value:"+max);
        System.out.println("Minimum value:"+min);

        //num of elements
        int n=arr.length;
        //first and last elements
        System.out.println("First Element:"+arr[0]);
        System.out.println("Last Element:"+arr[n-1]);

        //duplicate elements
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                if (i!=j && arr[i]==arr[j]){
                    System.out.println(arr[i]+" is duplicate value");
                    break;
                }
            }
        }
        //starts with 3
//        for(int i:arr){
//            if(String.ofValue(i).Start)
//        }
    }
    static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
}
