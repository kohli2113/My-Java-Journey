package PrimeNumberGame.src.Jan31;

public class Ques2_ValuesUnder20 {
    public static void main(String[] args) {
        int[] arr={12,34,56,32,15,14};
        int sum=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<40){
                sum+=arr[i];
                count++;
            }
//            if (arr[i]>20 && arr[i]<40){
//                System.out.println(arr[i]);
//            }
        }
        System.out.println(sum/count);

    }
}
