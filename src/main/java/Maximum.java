import java.util.ArrayList;

public class Maximum extends Worker{
    protected Maximum(ArrayList<Integer> numbers) {
        super(numbers);
    }

    @Override
    protected void doWork() {
        int maximum = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > maximum) {
                maximum = numbers.get(i);
            }
        }
        this.result = maximum;
    }
}
