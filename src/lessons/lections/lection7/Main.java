package lessons.lections.lection7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {


//        Reflection


        Person person = new Person("Taras", 30);
//        Class<? extends Person> personClass = person.getClass();
        Class<Person> personClass = Person.class;
//        Field[] fields = personClass.getFields();
//        Field[] declaredFields = personClass.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println("getFields() - "+field.getName());
//        }
//
//        for (Field declaredField : declaredFields) {
//            declaredField.setAccessible(true);
//            System.out.println("getDeclaredFields() - "+ declaredField.getName()+ declaredField.get(person));
//
//            if (declaredField.getType().equals(String.class)){
//                declaredField.set(person, "Another name");
//            }
//            System.out.println("getDeclaredFields() - "+ declaredField.getName()+ declaredField.get(person));
//        }
//        System.out.println(person);


        //        person.methodToTestArray(new String[] {"first", "second"});
        //        person.methodToTestVarArgs("first", "second");


//        personClass.getMethods();
//        Method[] declaredMethods = personClass.getDeclaredMethods();



        // Annotation (Validation)


        Person person1 = new Person("Taras", -5);
        System.out.println(person1);





    }
}
