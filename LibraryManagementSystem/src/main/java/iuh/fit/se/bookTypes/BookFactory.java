package iuh.fit.se.bookTypes;

import iuh.fit.se.Book;

public class BookFactory {
    public static Book createBook(String type, String title) {
        if (type.equalsIgnoreCase("paper")) return new PhysicalBook(title);
        if (type.equalsIgnoreCase("ebook")) return new EBook(title);
        return null;
    }
}