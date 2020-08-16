
class Deadlock {
    public static void main(String[] args) {
        final String s1 = "A";
        final String s2 = "B";

        Thread t1 = new Thread() {
            @Override
            public void run(){
                synchronized(s1) {
                    System.out.println(s1);
                }
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println(e);
                }
                synchronized(s1) {
                    System.out.println(s1);
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run(){
                synchronized(s2) {
                    System.out.println(s1);
                }
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println(e);
                }
                synchronized(s1) {
                    System.out.println(s1);
                }
            }
        };

        t1.start();
        t2.start();
    }
}