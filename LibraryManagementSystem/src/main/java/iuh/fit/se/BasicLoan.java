package iuh.fit.se;

public class BasicLoan implements Loan {
    private Book book;
    public BasicLoan(Book b) { this.book = b; }
    @Override public String getDetails() { return "Mượn sách: " + book.getTitle(); }
    @Override public double getCost() { return 10.0; } // Giá cơ bản
}
