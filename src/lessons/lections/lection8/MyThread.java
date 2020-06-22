package lessons.lections.lection8;

class MyThread implements Runnable {

//public class MyThread extends Thread {

    private int number;

    public MyThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < number ;i++) {

            System.out.println(number--);
        }
    }
}
