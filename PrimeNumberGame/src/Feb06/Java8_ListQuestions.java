package PrimeNumberGame.src.Feb06;
import java.util.*;
import java.util.stream.Collectors;

public class Java8_ListQuestions {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(12,45,32,67,97,53,70,24);
        int[] numss={12,45,32,67,97,53,70,24};

//        Separate Odd and Even numbers
        System.out.println(nums.stream().collect(Collectors.partitioningBy(i->i%2==0)));

//        Max and Min elements
        int max=nums.stream().max(Comparator.naturalOrder()).get();
        int min=nums.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Max num: "+max+"    Min num: "+min);

//        Second Largest Number in Integer Array
        int bignum2=nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("2nd largest element: "+bignum2);

//        Sum and Avg of array
        int sum=Arrays.stream(numss).sum(); //this does not take list as input it takes array only
        System.out.println("Sum of Elements: "+sum);
        double avg=Arrays.stream(numss).average().getAsDouble();
        System.out.println("Average of Elements: "+avg);

    }
}
