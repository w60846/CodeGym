package pl.codegym.task.task16.task1626;

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Zmniejsz").start();
        new Thread(new CountUpRunnable(), "Zwiększ").start();
    }

    public static class CountUpRunnable implements Runnable{
        private int countIndexUp;
        @Override
        public void run() {
            try {
            while (true) {
                System.out.println(Thread.currentThread().getName()+": " + ++countIndexUp);
                Thread.sleep(500);
                if (countIndexUp == Solution.number) return;


                }
            } catch (InterruptedException e) {
            }

        }

    }


    public static class CountdownRunnable implements Runnable {
        private int countdownIndex = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countdownIndex -= 1;
                    if (countdownIndex == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countdownIndex;
        }
    }
}
