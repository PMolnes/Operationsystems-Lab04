import java.util.ArrayList;

public class Average extends Worker {
    protected Average(ArrayList<Integer> numbers) {
        super(numbers);
    }

    @Override
    protected void doWork() {
        this.result = numbers.stream().reduce(0, Integer::sum) / numbers.size();
    }
}
