package PrimeNumberGame.src.Jan31;

import java.util.*;

//Write a Java program to add elements to an ArrayList, sort them, and print the sorted list.
public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(56);
        l1.add(34);
        l1.add(12);
        l1.add(82);
        l1.add(97);
        l1.add(63);
        l1.add(12);
        l1.add(56);
//        System.out.println("Unsorted List: "+l1);
//        Collections.sort(l1);
//        System.out.println("Sorted List: "+l1);
//        Write a program to remove duplicate elements from an ArrayList.
        Set s=new HashSet(l1);
//        System.out.println(s);
//        Write a program to traverse (or iterate) ArrayList.
//        for (int i : l1) {
//            System.out.println(i);
//        }
//        How do you find the maximum and minimum values from an ArrayList of integers?
//        int max=Collections.max(l1);
//        int min=Collections.min(l1);
//        System.out.println("Maximum value: "+max);
//        System.out.println("Minimum value: "+min);
//        Create a HashSet of integers and find its size.
        System.out.println(s.size());
        System.out.println(s);
//        Create a HashSet, add elements, and check if a specific element exists in the set.
        System.out.println(s.contains(56));
        System.out.println(s.contains(57));
    }
}
