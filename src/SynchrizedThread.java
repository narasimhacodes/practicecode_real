class Count {
    int count = 0;
    Boolean flag = true;

    public synchronized void thread1() {
        try {
            while (!flag) {
                wait();
            }
            count++;
            System.out.println("Thread 1 : " + count);
            flag = false;
            notify();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


    public synchronized void thread2() {
        try {
            while (flag) {

                wait();
            }
            count++;
            System.out.println("Thread 2: " + count);
            flag = true;
            notify();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
    public class SynchrizedThread {
        public static void main(String[] args) {
            Count c = new Count();
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 5; i++) {
                        try {
                            c.thread1();
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            });
            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 5; i++) {
                        try {
                            c.thread2();
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            });
            t1.start();
            t2.start();
        }
    }

