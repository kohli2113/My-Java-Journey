package Feb11;
import java.util.*;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InClass_Ques {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
        ls.add(23);
        ls.add(62);
        ls.add(62);
        ls.add(54);
        ls.add(41);
        ls.add(90);
        ls.add(90);
        ls.add(88);
        ls.add(73);

//        Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
        List<Integer> op=ls.stream().filter(n-> n%2==0).collect(Collectors.toList());
        System.out.println("Even Numbers: "+op);

//        How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> duplicates=ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(e-> e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("Duplicates: "+duplicates);

//        Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
        List<String> ls2=Arrays.asList("today","is","a","fine","day");
        for(String i:ls2){
            System.out.println(i.toUpperCase());
        }

//        Write a program where take a List of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> ls3=Arrays.asList(12,34,53,21,19);
        List<Integer> op2=ls3.stream().map(l->l).filter(l->l.toString().charAt(0)=='1').collect(Collectors.toList());
        System.out.println(op2);

//        Java 8 Program to Print ten random numbers using forEach?
        Random rn=new Random();
        IntStream.generate(()->rn.nextInt(100)).limit(10).forEach(System.out::println);
    }
}
