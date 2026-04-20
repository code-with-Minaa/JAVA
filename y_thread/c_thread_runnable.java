package y_thread;

public class c_thread_runnable implements Runnable {
    public static void main(String[] args) {
        Thread t1 = new Thread("Mina");
        Thread t2 = new Thread("Minu");

        t1.start();
        t2.start();

        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }

    @Override
    public void run() {
        
    }
}