package iuh.fit.se;

import iuh.fit.se.bookTypes.BookFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        // 1. Đăng ký Observer
        library.registerObserver(new Member("Sinh viên A"));

        // 2. Thêm sách bằng Factory
        Book b1 = BookFactory.createBook("ebook", "Lập trình Java");
        library.addBook(b1);

        // 3. Tìm kiếm bằng Strategy
        LibraryContext searchContext = new LibraryContext();
        searchContext.setStrategy(new SearchByTitle());
        System.out.println("Kết quả tìm kiếm: " + searchContext.executeSearch("Java", library.getBooks()).size());

        // 4. Mượn sách có Decorator
        Loan myLoan = new BasicLoan(b1);
        myLoan = new ExtendedTimeDecorator(myLoan); // Thêm tính năng gia hạn
        System.out.println(myLoan.getDetails() + " | Tổng phí: " + myLoan.getCost());
    }
}