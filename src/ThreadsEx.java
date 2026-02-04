import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class AT1 extends Thread {
    public void run(){
        for (int i =1; i< 10; i++){
            System.out.println("This is first Thread :" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class AT2 extends Thread{
     public synchronized void run(){
        for (int i= 1; i< 10; i++) {
            System.out.println("This is 2nd thread" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class AT3 implements Runnable{
    ExecutorService service = Executors.newFixedThreadPool(4);
    class counter{
        int count = 0;
        public void increment(){
            count++;
        }
    }
    counter c = new counter();
    public void run(){
        for (int i =0; i<10;i++){
            c.increment();
            System.out.println("this is 3rd Thread" + c.count);
        }

    }
}
public class ThreadsEx {
    public static void main(String[] args) throws InterruptedException {
       Thread t1 = new AT1();
       Thread t2 = new AT2();
       AT3 r1 = new AT3();
       Thread t3 = new Thread(r1);
       Thread t4 = new Thread(r1);

       t3.start();

       t1.start();
       t2.start();
       t4.start();

        t1.join();
        t2.join();

    }
}
