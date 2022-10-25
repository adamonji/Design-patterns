package strategy;

public class BubbleSort implements Strategy {
    @Override
    public void sort(int[] numbers) {
        int n = numbers.length;
        int temporaryNumber = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(numbers[j-1] > numbers[j]){
                    temporaryNumber = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temporaryNumber;
                }
            }
        }
        System.out.println("Bubble sort");
        for (int x : numbers)  {
            System.out.print(x + ", ");
        }
        System.out.println();

    }
}
