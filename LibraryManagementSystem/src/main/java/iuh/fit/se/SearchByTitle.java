package iuh.fit.se;

import java.util.List;

public class SearchByTitle implements SearchStrategy {
    @Override
    public List<Book> search(String k, List<Book> books) {
        return books.stream().filter(b -> b.getTitle().contains(k)).toList();
    }
}
