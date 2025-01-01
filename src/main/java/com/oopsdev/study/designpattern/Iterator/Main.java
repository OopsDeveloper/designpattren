package com.oopsdev.study.designpattern.Iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.addBook(new Book("연세의 용돈 기입장"));
        bookShelf.addBook(new Book("용돈 기입장 오픈은 가능한가"));
        bookShelf.addBook(new Book("2025년 용돈 기입장 쓸 수 있는가"));
        bookShelf.addBook(new Book("용돈기입장이 무엇인가"));

        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }

        System.out.println("--------------------------------");

        for (Book book : bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();
    }
}
