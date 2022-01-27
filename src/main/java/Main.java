import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        try {
            do {
                System.out.println("Write a number that you wish to add to the array. \nIf you don't want to add more numbers hit enter.");
                numbers.add(Integer.parseInt(sc.nextLine()));
            } while (true);
        } catch (NumberFormatException nfe) {
            System.out.println(numbers.toString());
            System.out.println("Numbers collected. Starting threads.");
        }
        Minimum minimum = new Minimum(numbers);
        Maximum maximum = new Maximum(numbers);
        Average average = new Average(numbers);

        new Thread(average).start();
        new Thread(minimum).start();
        new Thread(maximum).start();

        Thread.sleep(2000);

        System.out.println("Average: " + average.result);
        System.out.println("Minimum: " + minimum.result);
        System.out.println("Maximum: " + maximum.result);
    }
}
