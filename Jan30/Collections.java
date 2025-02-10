package Jan30;
import java.util.*;

public class Collections {

    static void useArrayList(){
        ArrayList<Integer> list = new ArrayList<>();
        //Adding element
        list.add(21);
        list.add(55);
        list.add(63);
        list.add(1, 10);
        list.add(25);
        System.out.println(list);

        //Removing element
        list.remove(2);
        System.out.println(list);

        //Checking whether a particular element exists
        System.out.println(list.contains(63));

        //Getting index of an element
        System.out.println(list.indexOf(10));
    }

    static void useLinkedList(){
        LinkedList<Integer> lst = new LinkedList<>();
        //Adding element

        lst.add(12);
        lst.add(11);
        lst.add(6);
        lst.add(22);
        System.out.println(lst);

        //Removing element
        //lst.remove();     //removes the head element
        lst.remove(1);
        System.out.println(lst);

        System.out.println(lst.contains(22));

        //Index of element
        System.out.println(lst.indexOf(12));
    }

    static void useHashSet(){
        HashSet<String> hs = new HashSet<>();
        //Adding element
        hs.add("Apple");
        hs.add("Mango");
        hs.add("Orange");
        hs.add("Apple");
        System.out.println(hs);

        //Removing element
        hs.remove("Orange");
        System.out.println(hs);

        System.out.println(hs.contains("Mango"));
        System.out.println("Size: " + hs.size());

        // Creating set from a list
        List<String> ls = Arrays.asList("Hello", "hey");

        HashSet<String> set = new HashSet<>(ls);
        System.out.println(set);


        //Adding list to the hashset
        hs.addAll(ls);
        System.out.println(hs);

    }

    static void useTreeSet(){
        TreeSet<String> ts = new TreeSet<>();
        ts.add("A");
        ts.add("C");
        ts.add("D");
        ts.add("B");
        ts.add("A");

        System.out.println(ts);

        ts.remove("A");
        System.out.println(ts);

        System.out.println("Size: " + ts.size());

        System.out.println("Whether B is present: " + ts.contains("B"));

        System.out.println("Last element: " + ts.last());
    }

    public static void main(String[] args) {
        useHashSet();
    }
}