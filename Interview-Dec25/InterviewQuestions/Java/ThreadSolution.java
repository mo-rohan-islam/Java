public class ThreadSolution {

    private static final Object lock = new Object();
    private static boolean isNumberTurn = true;

    private static final int LIMIT = 5;

    public static void main(String[] args) {

        Thread numberThread = new Thread(() -> {
            for (int i = 1; i <= LIMIT; i++) {
                synchronized (lock) {
                    while (!isNumberTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.print(i);
                    isNumberTurn = false;
                    lock.notify();
                }
            }
        });

        Thread characterThread = new Thread(() -> {
            for (int i = 0; i < LIMIT; i++) {
                synchronized (lock) {
                    while (isNumberTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    char ch = (char) ('A' + i);
                    System.out.print(ch + ", ");
                    isNumberTurn = true;
                    lock.notify();
                }

            }
        });

        numberThread.start();
        characterThread.start();
    }
}