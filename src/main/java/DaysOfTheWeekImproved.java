import java.util.Scanner;

public class DaysOfTheWeekImproved {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "It's Holiday!"};
        System.out.print("Enter an integer from 1 to 7: ");
        while (true) {                                                         // поки хтось щось вводить
            if (scan.hasNextInt()) {
                int number = scan.nextInt();
                if (number < 1 || number >= 8) {                               // якщо ввели ціле число поза діапазоном
                    System.out.println("You're out of range. Try again:");     // спробуйте ще разок
                    continue;
                } else if (number <= 6) {                                      // якщо ввели ціле число від 1 до 6
                    System.out.println(days[number - 1]);
                } else {
                    System.out.println(days[number - 2]);                      // якщо ввели число 7
                }
            } else {
                System.out.println("You've entered an invalid value");         // якщо ввели будь-що, окрім цілого числа
            }
            break;
        }
    }
}

