public class Reader {
    String fullName, tel;
    int ticketNumber;
    static int totalBooks;  // змінна для підрахунку усіх книг на руках
    public void takeBooks(int allBooks, int todayBooks){
        totalBooks = allBooks + todayBooks;  // всього книг
        System.out.println("Petrov took " + todayBooks + " books today. In total he has " + totalBooks + " books.");
        if (totalBooks > 5) {
            int count = totalBooks - 5;      // визначаємо скільки лишніх книжок має читач
            int fine = 50 * count;           // на кожну лишню книжку даємо штраф 50 грн
            System.out.println("Limit exceeded. The amount of the fine: " + fine + " grn.\n");
        }
    }
    public void returnBooks(int totalBooks, int returnBooks){
        System.out.println("Petrov returned " + returnBooks + " books today. In total he has " + (totalBooks - returnBooks) +  " books.");
        int count, fine, fineFuture;
        if (totalBooks > 5) {
            count = totalBooks - 5;  // визначаємо скільки лишніх книжок мав читач до повернення
            fine = 50 * count;       // на кожну лишню книжку даємо штраф 50 грн
            System.out.println("Before the return, the fine was: " + fine + " grn.");
        }
        if ((totalBooks - returnBooks) > 5) {                  // якщо після повернення на руках залишається більше 5-ти книг
            fineFuture = ((totalBooks-returnBooks) - 5) * 50;  // вираховуємо скільки лишніх книг залишилось поверх 5-ти дозволених і штрафуємо
            System.out.println("After the return, the fine will be: " + fineFuture + " grn.");
        }
    }
    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.takeBooks(8, 5);
        reader.returnBooks(totalBooks,4);
    }
}
