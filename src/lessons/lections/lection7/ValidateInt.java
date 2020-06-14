package lessons.lections.lection7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)   // оприділяє на якому етапі виконується валідація
@Target({ElementType.FIELD, ElementType.METHOD}) //оприділяє над чим має висіти анотаіця
public @interface ValidateInt {

    int min() default 0;

    int max() default 0;

    int defaultVal() default 0;
}
