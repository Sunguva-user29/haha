class EvenThread extends Thread {
    public void run() {
        for (int i = 100; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }

        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 100; i <= 200; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}
public class EvenOddThread {
    public static void main(String[] args)
    {
        EvenThread t1=new EvenThread();
        OddThread t2 =new OddThread();
        t1.setName("EVen thread");
        t2.setName("odd thread");
        t1.start();
        t2.start();
        

    }
}
