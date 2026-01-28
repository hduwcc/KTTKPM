package iuh.fit.se;

public abstract class Book {
    protected String title;
    protected String author;
    protected String category;
    public String getTitle() { return title; }
    public abstract String getType();
}
