import java.util.Scanner; // імпорт сканера

public class DaysOfTheWeek {
    public static void main(String[] args) {
        System.out.println("Enter an integer from 1 to 7:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        //перевірка на валідність вводу
        if (number == 1) {
            System.out.println ("Today is Monday");
        } else if (number == 2) {
            System.out.println ("Today is Tuesday");
        } else if (number == 3) {
            System.out.println ("Today is Wednesday");
        } else if (number == 4) {
            System.out.println ("Today is Thursday");
        } else if (number == 5) {
            System.out.println ("Today is Friday");
        } else if (number == 6 || number == 7 ) {
            System.out.println ("it's Holiday");
        } else {
            System.out.println ("You have entered an invalid value");
        }
    }
}