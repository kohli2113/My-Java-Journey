package Jan29;
import java.util.*;

public class Ques1 {
    private int id, age;
    private String name, designation;
    private void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id: ");
        int i=sc.nextInt();
        System.out.println("Enter age:");
        int a=sc.nextInt();
        System.out.println("Enter name:");
        String n=sc.next();
        System.out.println("Enter designation:");
        String d=sc.next();
        this.age=a;
        this.id=i;
        this.name=n;
        this.designation=d;
    }
    public void displayData(){
        getData();
        System.out.println("Age:"+age);
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Designation:"+designation);
    }

    public static void main(String[] args) {
        Ques1 q1=new Ques1();
//        q1.getData();
        q1.displayData();
    }


}
