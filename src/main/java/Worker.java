import java.util.ArrayList;

public abstract class Worker implements Runnable {

    protected ArrayList<Integer> numbers;
    public int result;

    @Override
    public void run() {
        doWork();
    }

    protected Worker(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    protected abstract void doWork();
}
