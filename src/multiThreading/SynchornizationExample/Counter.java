package multiThreading.SynchornizationExample;

public class Counter {
    private int count;

    public synchronized int  increment(){
        return count++;
    }

    public int getCount() {
        return count;
    }
}
