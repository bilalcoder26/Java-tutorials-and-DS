package multiThreading.SynchornizationExample;



public class SynchronizationExample {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread T1 = new MyThread(counter);
        MyThread T2 = new MyThread(counter);
        T1.start();   // 🔥 MUST
        T2.start();   // 🔥 MUST

        try{
            T1.join();
            T2.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.getCount());

    }
}
