package lessons.lections.lection4;

import java.util.*;

public class Main {

//    SET, MAP

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("first");
        stringSet.add("second");
        stringSet.add("third");
        stringSet.add("fourth");

        for (String str : stringSet) {
            System.out.println(str);
        }

        System.out.println();

        Set<Person> personHashSet = new HashSet<>();
        personHashSet.add(new Person("Taras", 30));
        personHashSet.add(new Person("Mike", 26));
        personHashSet.add(new Person("Haly", 30));
        personHashSet.add(new Person("Vova", 26));
        personHashSet.add(new Person("Vova", 26));
        for (Person person : personHashSet) {
            System.out.println(person);
        }

        System.out.println();

        Set<String> stringLinkedSet = new LinkedHashSet<>();
        stringLinkedSet.add("first");
        stringLinkedSet.add("second");
        stringLinkedSet.add("third");
        stringLinkedSet.add("fourth");

        for (String str1 : stringLinkedSet) {
            System.out.println(str1);
        }
        System.out.println();

        Set<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("first");
        stringTreeSet.add("second");
        stringTreeSet.add("third");
        stringTreeSet.add("fourth");

        for (String str2 : stringTreeSet) {
            System.out.println(str2);
        }

        System.out.println();

        Set<Person> personSet = new TreeSet<>();
        personSet.add(new Person("Taras", 30));
        personSet.add(new Person("Mike", 26));
        personSet.add(new Person("Haly", 30));
        personSet.add(new Person("Vova", 26));
        for (Person person : personSet) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println();

        Map<String, Person> map = new HashMap<>();
        map.put("first", new Person("Taras", 30));
        map.put("second", new Person("Mike", 26));
        map.put("third", new Person("Vova", 26));
        map.put("fourth", null);
        map.putIfAbsent("fourth", new Person("Haly", 30));
        map.put("second", new Person("Vova", 26));

        System.out.println(map.get("fourth"));
        for (Map.Entry<String, Person> entry : map.entrySet()) {
            System.out.println(entry);
        }
        map.remove("first");

        System.out.println();
        System.out.println();

        Map<Person, List<Engine>> map1 = new HashMap<>();

        Person ivan = new Person("Ivan", 23);
        Person vlodko = new Person("Vlodko", 25);

        map1.put(ivan, new ArrayList<>());
        map1.put(vlodko, new ArrayList<>());

        map1.get(ivan).add(new Engine(2.3, 230));
        map1.get(ivan).add(new Engine(2.0, 160));

        map1.get(vlodko).add(new Engine(2.2, 145));
        map1.get(vlodko).add(new Engine(2.4, 155));

        for (Map.Entry<Person, List<Engine>> listEntry : map1.entrySet()) {
            System.out.println(listEntry.getKey()+":");
            for (Engine engine : listEntry.getValue()) {
                System.out.println("\t" + engine);
            }
        }

        map1.keySet();
        map1.values();
        System.out.println(map1.keySet());
        System.out.println(map1.values());

    }

}
