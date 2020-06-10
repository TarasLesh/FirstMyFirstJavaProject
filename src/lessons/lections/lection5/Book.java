package lessons.lections.lection5;

import lombok.*;

import java.util.List;
import java.util.function.Predicate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class Book {

    @NonNull
    private String title;
    @NonNull
    private int pages;
    @NonNull
    private String country;

//    static class TestPagesMoreThan600 implements Predicate<Book> {
//
//        @Override
//        public boolean test(Book book) {
//            return book.getPages() > 600;
//        }
//    }

//    public static void showBigBooks(List<Book> bookList){
//        Predicate<Book> bookPredicate = new TestPagesMoreThan600();
//        for (Book book : bookList) {
//            if (bookPredicate.test(book)) {
//                System.out.println(book);
//            }
//        }
//    }





//    public static void showBigBooks(List<Book> bookList){
//        Predicate<Book> bookPredicate = new Predicate<Book>() {
//            @Override
//            public boolean test(Book book) {
//                return book.getPages() > 600;
//            }
//        };
//        for (Book book : bookList) {
//            if (bookPredicate.test(book)) {
//                System.out.println(book);
//            }
//        }
//    }




    public static void showBigBooks(List<Book> bookList){
        Predicate<Book> bookPredicate = book -> book.getPages() > 600;
        for (Book book : bookList) {
            if (bookPredicate.test(book)) {
                System.out.println(book);
            }
        }
    }

}

