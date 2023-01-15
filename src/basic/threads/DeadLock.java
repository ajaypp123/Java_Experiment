
class MyThread implements Runnable {

    Integer res1 = 0;
    Integer res2 = 1;
    boolean key = true;

    public void setKey(boolean key) {
        this.key = key;
    }

    private void method1() throws Exception {
        synchronized(res1) {
            Thread.sleep(3000);
            System.out.println(res1);
            synchronized(res2) {
                System.out.println(res2);
            }
        }
    }

    private void method2()  throws Exception {
        synchronized(res2) {
            Thread.sleep(3000);
            System.out.println(res2);
            synchronized(res1) {
                System.out.println(res1);
            }
        }
    }

    public void run() {
        try {
            if(key) {
                method1();
            } else {
                method2();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}


public class DeadLock {
    public static void main(String[] args) {

        MyThread t = new MyThread();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        t1.start();
        t.setKey(false);
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
