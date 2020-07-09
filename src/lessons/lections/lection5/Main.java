package lessons.lections.lection5;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String... args) {
//        Book myBook = new Book();
//
//        myBook.toString();

//        Lombok, Lambda, Stream

        Book book1 = new Book("1932", 550, "Ukraine");
        Book book2 = new Book("11/22/63", 750, "USA");
        Book book3 = new Book("Kobzar", 655, "Ukraine");
        Book book4 = new Book("Dark Tower", 1543, "USA");

        Person person1 = new Person("Taras", 30, Arrays.asList(book1, book2));
        Person person2 = new Person("Haly", 29, Arrays.asList(book1, book3, book4));

        List<Person> personList = Arrays.asList(person1, person2);

//        Collections.singletonList - коли List з одного елемента

//        List<Book> books = Arrays.asList(book1, book2, book3, book4);

//        Arrays.asList - створення масиву ------

//        Book.showBigBooks(books);

//        Consumer<Book> consumer = book -> System.out.println(book);

//        books.forEach(consumer);

//        books.forEach(book -> System.out.println(book));

//        books.forEach(System.out::println);


        //        STREAM

//        long count = books.stream().count();
//        System.out.println(count);

//        long usaCount = books.stream().filter(book -> book.getPages() > 600)
//                .filter(book -> book.getCountry().equals("USA"))
//                .count();
//        System.out.println(usaCount);


//        List<Book> usaList = books.stream().filter(book -> book.getPages() > 600)
//                .filter(book -> book.getCountry().equals("USA"))
//                .collect(Collectors.toList());
//
//        usaList.forEach(book -> System.out.println(book));


//        Function<Book,String> bookNames = book -> book.getTitle();

//        Function<Book, String> stringFunction = new Function<Book, String>() {
//            @Override
//            public String apply(Book book) {
//                return book.getTitle();
//            }
//        };


//        List<String> stringList = books.stream().map(book -> book.getTitle()).collect(Collectors.toList());
//
//        System.out.println(stringList);
//        for (String s : stringList) {
//            System.out.println(s);
//        }

//        List<String> countriesList = books.stream().map(book -> book.getCountry()).collect(Collectors.toList());

//        Set<String> countriesList = books.stream().map(book -> book.getCountry()).collect(Collectors.toSet());

//        List<String> countriesList = books.stream()
//                .map(book -> book.getCountry())
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(countriesList);

//    books.parallelStream()   - коли неважливий результат

//        List<Book> bookList = books.stream()
//                .filter(book -> "France".equals(book.getCountry()))
//                .collect(Collectors.toList());
//        System.out.println(bookList);


//        Optional<Book> first = books.stream()
//                .filter(book -> "France".equals(book.getCountry()))
//                .findFirst();

//        System.out.println(first.isPresent());
//        System.out.println(first.orElse(new Book()));

//        Supplier<Book> supplier = () -> {
//            return new Book();
//        };

//        System.out.println(first.orElseGet(Book::new));

//        List<String> booksCollect = personList.stream()
//                .map(person -> person.getBooks())
//                .flatMap(Collection::stream)
//                .map(book -> book.getTitle())
//                .collect(Collectors.toList());
//
//        for (String title : booksCollect) {
//            System.out.println(title);
//        }
//        flatMap - коли колекція в колекції (матрьошка)

//        long count = personList.stream()
//                .map(person -> person.getBooks())
//                .flatMap(Collection::stream).count();
//        System.out.println(count);

//        Function.identity() - функція, яка приймає об'єкт і його ж повертає

        Map<Person, List<Book>> map = personList.stream().collect(Collectors.toMap(Function.identity(), Person::getBooks));

        System.out.println(map);

        for (Map.Entry<Person, List<Book>> personListEntry : map.entrySet()) {
            System.out.println(personListEntry.getKey().getName());
            for (Book book : personListEntry.getValue()) {
                System.out.println(book.getTitle());
            }
        }

    }
}
