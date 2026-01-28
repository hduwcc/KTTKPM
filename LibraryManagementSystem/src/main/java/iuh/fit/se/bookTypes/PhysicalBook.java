package iuh.fit.se.bookTypes;

import iuh.fit.se.Book;

public class PhysicalBook extends Book {
    public PhysicalBook(String t) { this.title = t; }
    @Override public String getType() { return "Sách giấy"; }
}
