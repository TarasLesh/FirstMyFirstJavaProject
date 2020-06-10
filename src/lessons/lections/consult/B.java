package lessons.lections.consult;

public class B extends A {

    public B(int a) {
        super(a);
    }

    public  void bMethod(){
        System.out.println("Method from B");
    }

    @Override
    public void aMethod() {
        System.out.println("Method from A, but in B style");
    }

    @Override
    public String toString() {
        return "to sting B";
    }
}
