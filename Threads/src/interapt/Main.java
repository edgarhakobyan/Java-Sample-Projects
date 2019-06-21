package interapt;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Counter());
        thread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
    }
}

class Counter extends Thread {
    @Override
    public void run() {
        int i = 0;

        while (!isInterrupted()) {
            System.out.println("i = " + i++);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
