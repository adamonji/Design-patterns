package strategy;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {5,6,54,3,48,0};

        Context context = new Context(new BubbleSort());
        context.execute(numbers);

        context = new Context(new InsertSort());
        context.execute(numbers);

    }
}
