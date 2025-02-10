package Feb03;
//You need to write a program that accepts two numbers as input and performs division. However, the program needs to handle multiple exceptions:
//        If the user enters non-integer values, it should catch a NumberFormatException.
//        If the denominator is zero, it should catch an ArithmeticException.
//        Print the corresponding error message for each type of exception.

import java.util.*;
import java.io.*;
public class Ques3_ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numberator:");
        int a=Integer.parseInt(sc.nextLine());
        System.out.println("Enter denominator:");
        int b=Integer.parseInt(sc.nextLine());
        try{
            System.out.println("After dividing:"+a/b);
        }catch(NumberFormatException e){
            System.out.println("Enter integer numbers");
        }catch (ArithmeticException e){
            System.out.println("Denominator should not be 0");
        }
    }
}
