package lessons.lections.lection5;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Person {

    @NonNull
    private String name;

    @NonNull
    private int age;

    @NonNull
    private List<Book> books;
}
