import java.util.Arrays;

public class ArrayActions {

    public static void main(String[] args) {

        int[] numbers = {6, 2, 18, 7, 15, 21};
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        // Вивід кількості значень у першому масиві
        System.out.println("Array contains " + numbers.length + " elements" + "\n");

        // 1. спосіб - знаходимо min і max значення в масиві без сортування
        int min = numbers[0]; int max = numbers[0];
        for (int i: numbers) {
            if(i < min) min = i;
            if(i > max) max = i;
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max  + "\n");

        // 2. спосіб - сортування масиву і вивід першого та останнього значень
        Arrays.sort(numbers);
        System.out.println("Smallest array number: " + numbers[0]);
        System.out.println("Largest array number: "+ numbers[numbers.length - 1] + "\n");

        System.out.println(Arrays.toString(weekdays));  // виводимо значення другого масиву

    }
}
