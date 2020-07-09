package lessons.lections.consult;

public class A {

    private int A;

    public A(int a) {
        A = a;
    }

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public void aMethod(){
        System.out.println("Method from A");
    }

    @Override
    public String toString() {
        return "to sting A";
    }
}
