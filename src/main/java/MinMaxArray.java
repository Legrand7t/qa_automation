public class MinMaxArray {
    public static void main(String[] args) {
        int[] numbers = {6, 2, 18, 7, 15, 21};

        // знаходимо min і max значення в масиві без сортування

        int min = numbers[0]; int max = numbers[0];
        for (int i: numbers) {
            if(i < min) min = i;
            if(i > max) max = i;
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max );
    }
}
