package y_thread;

class MeroThread implements Runnable {
    public void run() {
        System.out.println("Thread is running......");
    }
}

public class e_thread_runnable {
    public static void main(String[] args) {
        MeroThread mt = new MeroThread();
        Thread t = new Thread(mt);

        t.start();
    }
}