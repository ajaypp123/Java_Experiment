

class MyThread implements Runnable {
    private int c;

    MyThread() {
        c = 0;
    }

    public int getNotSharedSum() {
        return c;
    }

    /*
    // Solution 1: to race condition
    private void execute() {
        synchronized(this) {
            for(int i=0; i<10; i++) {
                c++;
                System.out.println(Thread.currentThread().getName() + " In: " + c);
            }
        }
    }

    // Solution 2: to race condition
    private synchronized void execute() {
        for(int i=0; i<10; i++) {
            c++;
            System.out.println(Thread.currentThread().getName() + " In: " + c);
        }
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " Before: " + c);
        execute();
        System.out.println(Thread.currentThread().getName() + " After: " + c);
    }
    */

    public void run() {
        System.out.println(Thread.currentThread().getName() + " Before: " + c);
        for(int i=0; i<10; i++) {
            c++;
            System.out.println(Thread.currentThread().getName() + " In: " + c);
        }
        System.out.println(Thread.currentThread().getName() + " After: " + c);
    }
}

public class RaceCondition {

    public static void main(String[] args) {

        MyThread th = new MyThread();
        Thread t = new Thread(th, "T1");
        Thread t1 = new Thread(th, "T2");

        t.start();
        t1.start();

        try {
            t.join();
            t1.join();
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println(th.getNotSharedSum());
    }
}
