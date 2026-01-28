package iuh.fit.se;

import java.util.List;

public interface SearchStrategy {
    List<Book> search(String keyword, List<Book> books);
}
