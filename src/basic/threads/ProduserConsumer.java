import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;

/*
 * Producer Consumer
*/

interface MessageBus {
    public void getMsg();
    public void produceMsg(String msg);
}

class MessageBusImpl implements MessageBus {
    LinkedList<String> bus;
    Semaphore p = new Semaphore(1);
    Semaphore c = new Semaphore(1);

    MessageBusImpl() {
        bus = new LinkedList<>();
    }

    @Override
    public void getMsg() {
        try {
            c.acquire();
            System.out.println("Consumed: " + bus.removeLast());
            p.release();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public void produceMsg(String msg) {
        try {
            p.acquire();
            bus.addFirst(msg);
            System.out.println("Produced: " + msg);
            c.release();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

class Service implements Runnable {
    MessageBus bus;
    LinkedList<String> li;
    boolean produce = true;

    public void setProduce(boolean produce) {
        this.produce = produce;
    }

    Service(LinkedList<String> li) {
        bus = new MessageBusImpl();
        this.li = li;
    }

    @Override
    public void run() {
       if(produce) {
            System.out.println("Producing:");
            while(!li.isEmpty()) this.bus.produceMsg(li.removeFirst());
       } else {
            System.out.println("Consuming:");
            while (!li.isEmpty()) this.bus.getMsg();
            this.bus.getMsg();
       }
    }

}

public class ProduserConsumer {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<>();
        li.add("a");
        li.add("b");
        li.add("c");
        li.add("d");
        li.add("e");
        li.add("f");
        System.out.println(li);

        Service s = new Service(li);
        Thread producer = new Thread(s);
        Thread consumer = new Thread(s);

        producer.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        s.setProduce(false);
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}