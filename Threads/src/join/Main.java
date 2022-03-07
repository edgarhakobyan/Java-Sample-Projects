package join;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread other = new Thread(new OtherThread());
        other.start();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(2000);
            System.out.println("i = " + i);
            if (i == 2) {
                System.out.println(Thread.currentThread().getName());
                other.join();
            }
        }
    }
}

class OtherThread implements Runnable {

    @Override
    public void run() {
        for (int j = 0; j < 5; j++) {
            try {
                Thread.sleep(2000);
                System.out.println("j = " + j + " " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
