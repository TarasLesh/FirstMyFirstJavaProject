package lessons.lections.lection3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>();
        list.add("first");
        list.add("second");
        list.add("first");
        list.add("third");
        list.add(1, "another");
        list.add("first");
        list.set(1, "anotherSet");
//        list.add(null);


        System.out.println(list);

        for (String s : list) {
            System.out.println(s);
        }

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if ("first".equals(s)) {
                System.out.println(i + " " + s);
            }
        }

        System.out.println(list.size());
        System.out.println(list.contains("first"));
        System.out.println(list.get(2));
        System.out.println(list.indexOf("second"));
        System.out.println();
        System.out.println(list.indexOf("first"));
        list.remove("first");
        System.out.println(list.lastIndexOf("first"));
//        list.clear();

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Taras", 30));
        persons.add(new Person("Mike", 26));
        persons.add(new Person("Haly", 30));
        persons.add(new Person("Vova", 26));
        for (Person person : persons) {
            if (person.getAge() > 28) {
                System.out.println(person);
            }
        }

        for (Person person : persons) {
            if (person.getName().length() < 5) {
                System.out.println(person);
            }
        }

        for (Person person : persons) {
            if (person.getName().startsWith("T")) {
                System.out.println(person);
            }
        }

        System.out.println("_____");

        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            if (person.getName().startsWith("T")){
                iterator.remove();
            }
        }

        iterator = persons.iterator();

        while (iterator.hasNext()){
            Person person = iterator.next();
            if (person.getName().startsWith("H")){
                iterator.remove();
            }
        }

        for (Person person : persons) {
            System.out.println(person);
        }

    }
}
