package Feb14;

//Scenario: You are developing a library management system. The system needs to keep track of books and their availability.
//        Each book has a unique ID, title, author, and a flag indicating whether it is currently available or checked out.
//        You need to implement a feature that allows users to search for books by title or author and get a list of available books. Task:
//        Create a Book class with the necessary fields and methods.
//        Use an appropriate Java collection to store the books.
//        Implement methods to:
//        Add a new book to the collection.
//        Search for books by title or author.
//        List all available books.

import java.util.*;

public class LibManage {
    private List<Book> bookList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Add a new book to the collection..");
        System.out.println("2. Search for books by title or author..");
        System.out.println("3. List all available books..");

        int choice;
        System.out.println("Enter what you want to do: ");

    }

    public void addBook(){
        System.out.println("Enter ID: ");
        int id=sc.nextInt();
        System.out.println("Enter Title: ");
        String title=sc.nextLine();
        System.out.println("Enter Author: ");
        String author=sc.nextLine();
        System.out.println("Enter whether the book is available or not (true/false): ");
        boolean flag= sc.nextBoolean();

        bookList
    }
}
