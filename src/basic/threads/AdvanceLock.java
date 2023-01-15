import java.util.concurrent.locks.ReentrantLock;

class MyThread implements Runnable {
    private int c;
    ReentrantLock lock = new ReentrantLock();

    MyThread() {
        c = 0;
    }

    public int getNotSharedSum() {
        return c;
    }

    // Solution 2: to race condition
    private synchronized void execute() {
        lock.lock();
        for(int i=0; i<10; i++) {
            c++;
            System.out.println(Thread.currentThread().getName() + " In: " + c);
        }
        lock.unlock();
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " Before: " + c);
        execute();
        System.out.println(Thread.currentThread().getName() + " After: " + c);
    }

}

public class AdvanceLock {

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
