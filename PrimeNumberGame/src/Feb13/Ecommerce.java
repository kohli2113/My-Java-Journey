package PrimeNumberGame.src.Feb13;

//Program: You are developing an e-commerce application that processes customer orders. Each order involves checking the availability of items,
//        calculating the total cost, and processing the payment. If any step fails (e.g., item out of stock, payment failure), the order should
//        be cancelled, and an appropriate error message should be displayed to the user.
//        Write a Java program that simulates this order processing. Use exception handling to manage errors and ensure that the order is cancelled
//        if any step fails.
//        Custom Exceptions: Define custom exceptions (ItemOutOfStockException and PaymentFailedException) to handle specific error conditions.
//        Order Processing: The processOrder method orchestrates the order processing steps.
//        Item Availability Check: The checkItemAvailability method checks if the item is in stock and throws an exception if not.
//        Cost Calculation: The calculateTotalCost method calculates the total cost of the order.
//        Payment Processing: The processPayment method processes the payment and throws an exception if the payment fails.
//        Exception Handling: In the main method, exceptions are caught and appropriate error messages are displayed.


import java.util.Scanner;

public class Ecommerce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter if item is in stock: ");
        boolean i = sc.nextBoolean();
        System.out.println("Enter if Payment was successful: ");
        boolean s = sc.nextBoolean();

        System.out.println("Enter Quantity: ");
        int q = sc.nextInt();
        System.out.println("Price per item: ");
        float p = sc.nextFloat();

        OrderProcessor order1 = new OrderProcessor(i, s);
        order1.processOrder(q, p);

    }

    static class ItemOutOfStockException extends Exception {
        public ItemOutOfStockException(String message) {
            super(message);
        }
    }

    static class PaymentFailedException extends Exception {
        public PaymentFailedException(String message) {
            super(message);
        }
    }


}
