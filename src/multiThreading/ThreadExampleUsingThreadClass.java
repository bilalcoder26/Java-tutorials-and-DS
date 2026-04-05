package multiThreading;

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running : " + Thread.currentThread().getName());
    }
}
public class ThreadExampleUsingThreadClass{
    public static void main(String[] args) {
        MyThread T1 = new MyThread();
        MyThread T2 = new MyThread();
        T1.start();
        T2.start();
    }

}
