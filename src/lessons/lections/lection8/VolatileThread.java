package lessons.lections.lection8;

public class VolatileThread extends Thread {

    private final VolatileExample volatileExample;

    public VolatileThread(VolatileExample volatileExample) {
        this.volatileExample = volatileExample;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            int currentNumber = volatileExample.getCount();
            System.out.println(Thread.currentThread().getName() + ": Old value: " + currentNumber +
                    ", New value: " + volatileExample.increaseCount());
        }
    }
}
