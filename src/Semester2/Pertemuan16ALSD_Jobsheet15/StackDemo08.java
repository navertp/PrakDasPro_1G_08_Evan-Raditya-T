package Semester2.Pertemuan16ALSD_Jobsheet15;

import java.util.Stack;

public class StackDemo08 {
    public static void main(String[] args) {
        Book08 book1 = new Book08("1234", "Dasar Pemrogramman");
        Book08 book2 = new Book08("7145", "Hafalah Shalat Delisa");
        Book08 book3 = new Book08("3562", "Muhammad Al-Fatih");

        Stack<Book08> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book08 temp = books.peek();

        if (temp != null) {
            System.out.println(temp.toString());
        }

        Book08 temp2 = books.pop();

        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        for (Book08 book08 : books) {
            System.out.println(book08.toString());
        }
        
        System.out.println(books);

        int posisi = books.search(book2);
        System.out.println("Posisi book2 dari atas stack: " + posisi);
    }
}
