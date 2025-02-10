import java.util.Scanner;

public class Task_GradeCreator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks:");
        int a=sc.nextInt();
        try {
            if (a<=100 && a>=75){
                System.out.println("grade A");
            } else if (a<=74 && a>=40) {
                System.out.println("grade B");
            }else{
                throw new IllegalArgumentException();
            }
        }catch (IllegalArgumentException e){
            System.out.println("Invalid Grade! Please try again.");
        }
    }
}
