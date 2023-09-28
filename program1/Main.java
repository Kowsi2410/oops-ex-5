/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import books.Books;
import journals.Journals;

class Staff {
    List<Book> books = new ArrayList<>();
    List<Journals> journals;

    Staff() {
        this.journals = new ArrayList<>();
    }

    public void addBook(Books book) {
        books.add(book);
    }

    public void addJournal(Journals journal) {
        journals.add(journal);
    }

    public void displayBooks() {
        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayJournals() {
        System.out.println("Journals:");
        for (Journals journal : journals) {
            System.out.println(journal);
        }
    }

   // void addBook(Books book) {
     //   throw new UnsupportedOperationException*/("Not supported yet."); 
   // }

}

class Student {
    List<Book> borrowedBooks = new ArrayList<>();

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void displayBorrowedBooks() {
        System.out.println("Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Staff staff = new Staff();
        Student student = new Student();

        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Book");
            System.out.println("2. Add Journal");
            System.out.println("3. Display Books");
            System.out.println("4. Display Journals");
            System.out.println("5. Borrow Book (Student)");
            System.out.println("6. Display Borrowed Books (Student)");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addBook(staff, scanner);
                case 2 -> addJournal(staff, scanner);
                case 3 -> staff.displayBooks();
                case 4 -> staff.displayJournals();
                case 5 -> borrowBook(student, staff, scanner);
                case 6 -> student.displayBorrowedBooks();
                case 7 -> System.out.println("Exiting program.");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
    }

    private static void addBook(Staff staff, Scanner scanner) {
        System.out.print("Enter Book ID: ");
        int bookId = scanner.nextInt();
        System.out.print("Enter Accession Number: ");
        int accessionNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Book Name: ");
        String bookName = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Publication: ");
        String publication = scanner.nextLine();

        //Books book;
        Books book = new Books(bookId, accessionNumber, bookName, author, publication);
        staff.addBook(book);
        System.out.println("Book added successfully.");
    }

    private static void addJournal(Staff staff, Scanner scanner) {
        System.out.print("Enter Journal ID: ");
        int journalId = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Journal Name: ");
        String journalName = scanner.nextLine();

        Journals journal = new Journals(journalId, journalName);
        staff.addJournal(journal);
        System.out.println("Journal added successfully.");
    }

    private static void borrowBook(Student student, Staff staff, Scanner scanner) {
        System.out.print("Enter Book ID to borrow: ");
        int bookId = scanner.nextInt();
        // Search for the book in the staff's list and borrow it if found
        for (Book book : staff.books) {
            if (book.getBookId() == bookId) {
                student.borrowBook(book);
                staff.books.remove(book);
                System.out.println("Book borrowed successfully.");
                return;
            }
        }
        System.out.println("Book not found or unavailable.");
    }
}

