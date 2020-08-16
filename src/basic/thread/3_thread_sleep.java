
class NumberPrint extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i +" "+ Thread.currentThread().getName());
        }
    }
}

class ThreadSleep {
    public static void main(String[] args) {
        NumberPrint n1 = new NumberPrint();
        NumberPrint n2 = new NumberPrint();

        n1.start();
        n2.start();

        System.out.println("Name of t1:"+n1.getName());
        System.out.println("Name of t2:"+n2.getName());
        System.out.println("id of t1:"+n1.getId());

        try {
            n1.join();
            n2.join(1);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}