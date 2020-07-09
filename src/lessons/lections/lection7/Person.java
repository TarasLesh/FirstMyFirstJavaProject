package lessons.lections.lection7;

import java.util.Objects;

public class Person extends A {
    private String name;
    @ValidateInt(min = 0, max = 100, defaultVal = 25)   // annotation
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        Validator.validateInt(this.getClass(), this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void methodToTestArray (String[] mas){
        for (String ma : mas) {
            System.out.println(ma);
        }
    }

    public void methodToTestVarArgs (String... mas){
        for (String ma : mas) {
            System.out.println(ma);
        }
    }
}
