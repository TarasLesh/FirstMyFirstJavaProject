package lessons.lections.lection8;

public class VolatileExample {
private volatile int count = 0;

    public int getCount() {
        return count;
    }

    public int increaseCount(){
        return ++count;
    }
}
