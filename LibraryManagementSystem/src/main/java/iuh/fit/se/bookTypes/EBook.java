package iuh.fit.se.bookTypes;

import iuh.fit.se.Book;

public class EBook extends Book {
    public EBook(String t) { this.title = t; }
    @Override public String getType() { return "Sách điện tử"; }
}
