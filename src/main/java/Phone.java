public class Phone {
    String number, model, weight;

    public void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    public String getNumber() {
        return number;
    }
    public static void main(String[] args) {
        Phone phone1 = new Phone(); Phone phone2 = new Phone(); Phone phone3 = new Phone();     // створюємо три об'єкти

        phone1.number = "+38(097)9998877";                           // не вивожу, щоб не було дубля
        System.out.println(phone1.model = "APPLE iPhone 12 128GB");
        System.out.println(phone1.weight = "164g");
        phone1.receiveCall("Rob");
        System.out.println(phone1.getNumber() + "\n");               // вивожу номер тут

        phone2.number = "+38(067)5554433";
        System.out.println(phone2.model = "XIAOMI 11T 8/128GB");
        System.out.println(phone2.weight = "203g");
        phone2.receiveCall("Mark");
        System.out.println(phone2.getNumber() + "\n");

        phone3.number = "+38(063)7778899";
        System.out.println(phone3.model = "SAMSUNG Galaxy S21 Ultra 12/128 Gb");
        System.out.println(phone3.weight = "228g");
        phone3.receiveCall("Alex");
        System.out.println(phone3.getNumber() + "\n");
    }
    // Три конструктора (не влізло в перший скрін)
    public Phone(String number, String model, String weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(){}     // без параметрів
}
