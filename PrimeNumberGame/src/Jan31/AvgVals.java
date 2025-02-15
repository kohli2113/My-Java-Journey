package PrimeNumberGame.src.Jan31;

public class AvgVals {
    public static void main(String[] args) {
        int[] arr={34,55,98,12,34, 49};
        int sum=0;
        for (int i:arr){
            sum+=i;
        }
        System.out.println(sum/arr.length);
    }
}
