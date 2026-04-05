package multiThreading;

class MyTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running  : " + Thread.currentThread().getName());
    }
}

public class RunnableInterfaceExample {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        // using lambda with Runnable
        Thread t3 = new Thread(() -> {
            System.out.println("Thread using lambda ");
        });
        t3.start();
    }

}
