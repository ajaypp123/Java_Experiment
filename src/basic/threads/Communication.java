import java.util.LinkedList;

class MyThread1 extends Thread {
    LinkedList<String> li;

    MyThread1(LinkedList<String> li) {
        this.li = li;
    }

    @Override
    public void run() {
        while(true) {
            synchronized(li) {
                try {
                    Thread.sleep(2000);
                    li.add("a");
                    System.out.println("Produced : " + li);
                    this.notifyAll();
                    //this.wait();
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
    }
}

class MyThread2 extends Thread {
    LinkedList<String> li;

    MyThread2(LinkedList<String> li) {
        this.li = li;
    }

    @Override
    public void run() {
       while (true) {
            synchronized(li) {
                try {
                    this.wait();
                    System.out.println(li.removeFirst());
                    //this.notify();
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
       }
    }
}

public class Communication {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<>();

        MyThread1 t1 = new MyThread1(li);
        MyThread2 t2 = new MyThread2(li);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
