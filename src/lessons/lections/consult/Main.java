package lessons.lections.consult;

public class Main {
    public static void main(String[] args) {
        A a = new A(5);
        B b = new B(5);
        A ab = new B(5);

        a.aMethod();
        b.aMethod();
        b.bMethod();
        ab.aMethod();

        B ab1 = (B) ab;
        ab1.bMethod();

        System.out.println(ab);
    }
}
