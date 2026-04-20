package y_thread;

class MyThread extends Thread{
    public void run() {
        System.out.println("My Thread is running.");
    }
}

public class d_thread {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        Thread t = new Thread(m1);
        t.start();
    }
}
