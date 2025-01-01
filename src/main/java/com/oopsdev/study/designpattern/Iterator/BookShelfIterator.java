package com.oopsdev.study.designpattern.Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

// BookShelf 클래스의 검색을 실행하는 클래스
public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int currentIndex;
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < bookShelf.getLength() ? true : false;
    }

    @Override
    public Book next() {

        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = bookShelf.getBookAt(currentIndex);
        currentIndex++;
        return book;
    }
}
