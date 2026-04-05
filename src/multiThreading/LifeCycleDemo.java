package multiThreading;

public class LifeCycleDemo extends  Thread{
    @Override
    public void run() {
        System.out.println("Thread running ");
        try {
            Thread.sleep(1000); // TIMED_WAITING
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread finished");
    }

    public static void main(String[] args) throws InterruptedException {
        LifeCycleDemo t = new LifeCycleDemo();
        System.out.println(t.getState()); // NEW
        t.start();
        System.out.println(t.getState()); //RUNNABLE
        Thread.sleep(500);
        System.out.println(t.getState()); //time waiting
        t.join();
        System.out.println(t.getState());

    }
}
