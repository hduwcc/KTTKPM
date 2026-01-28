package iuh.fit.se;

import java.util.*;

public class Library {
    private static Library instance;
    private List<Book> books = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    private Library() {} // Private constructor

    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
        notifyObservers("Sách mới thêm vào: " + book.getTitle());
    }

    // Observer methods
    public void registerObserver(Observer o) { observers.add(o); }
    private void notifyObservers(String message) {
        for (Observer o : observers) o.update(message);
    }

    public List<Book> getBooks() { return books; }
}
