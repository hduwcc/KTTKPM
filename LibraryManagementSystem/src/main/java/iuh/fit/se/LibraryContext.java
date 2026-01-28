package iuh.fit.se;

import java.util.List;

public class LibraryContext {
    private SearchStrategy strategy;
    public void setStrategy(SearchStrategy s) { this.strategy = s; }
    public List<Book> executeSearch(String k, List<Book> books) {
        return strategy.search(k, books);
    }
}
