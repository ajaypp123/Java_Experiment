
class MyThread implements Runnable {
    private static int sharedSum;
    private int notSharedSum;
    private int add;

    MyThread(int a) {
        sharedSum = 0;
        notSharedSum = 0;
        add = a;
    }

    public static int getSharedSum() {
        return sharedSum;
    }

    public int getNotSharedSum() {
        return notSharedSum;
    }

    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println(i);
            sharedSum += add;
            notSharedSum++;
        }
    }
}

public class Multithread {
    public static void main(String[] args) {

        MyThread th = new MyThread(1);
        Thread t = new Thread(th);

        MyThread th1 = new MyThread(-1);
        Thread t1 = new Thread(th1);

        t.start();
        t1.start();

        try {
            t.join();
            t1.join();
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println(MyThread.getSharedSum());
        System.out.println(th.getNotSharedSum());
        System.out.println(th1.getNotSharedSum());
    }
}
