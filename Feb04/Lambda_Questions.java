package Feb04;

import java.util.Arrays;
import java.util.List;

public class Lambda_Questions {
    interface SumOfIntegers{
        void sum(int a, int b);
    }

    interface CheckString{
        boolean check(String str);
    }

    public static void main(String[] args) {

        SumOfIntegers obj = (a, b) -> {
            System.out.println("Sum: " + (a + b));
        };

        obj.sum(1, 20);


        //TASK2
        CheckString obj2 = (str) -> str.isEmpty();
        System.out.println(obj2.check(""));

        //TASK3
        List<String> lst = Arrays.asList("Hello", "WORLD", "hey", "HI");
        System.out.println("Original List: " + lst);

        lst.replaceAll(x -> x.toLowerCase());
        System.out.println("LowerCase List: " + lst);
        lst.replaceAll(x -> x.toUpperCase());
        System.out.println("UpperCase List: " + lst);

        //TASK4
        List<Integer> numlist = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> evenList = numlist.stream().filter(x -> x % 2 == 0).toList();
        List<Integer> oddList = numlist.stream().filter(x -> x % 2 != 0).toList();

        System.out.println("Even Numbers: " + evenList);
        System.out.println("Odd Numbers: " + oddList);

        //TASK5
        List<String> strList = Arrays.asList("Array", "HashMap", "LinkedList", "Set");
        strList.sort((a, b) -> a.compareTo(b));
        System.out.println("Sorted List: " + strList);
    }
}
