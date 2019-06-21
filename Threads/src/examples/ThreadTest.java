package examples;

import java.util.ArrayList;

//public class ThreadTest extends Thread {
public class ThreadTest implements Runnable {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new ThreadTest());
        thread.start();

        ArrayList obj = new ArrayList();
        for (int i = 0; i < 100000; ++i) {
            obj.add(new Object());
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
