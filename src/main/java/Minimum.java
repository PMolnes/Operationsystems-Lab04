import java.util.ArrayList;

public class Minimum extends Worker {
    protected Minimum(ArrayList<Integer> numbers) {
        super(numbers);
    }

    @Override
    protected void doWork() {
        int minimum = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < minimum) {
                minimum = numbers.get(i);
            }
        }
        this.result = minimum;
    }
}
