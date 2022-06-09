public class PhoneImproved {
    String number, model, weight;

    public void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    public String getNumber() {
        return number;
    }

    public PhoneImproved(String number, String model, String weight){

        this.number = number;
        this.model = model;
        this.weight = weight;
    }       // конструктор з трьома аргументами

    public static void main(String[] args) {

        PhoneImproved phone1 = new PhoneImproved("+38(097)9998877", "APPLE iPhone 12 128GB", "164g");
        System.out.println(phone1.model + "\n" + phone1.weight);
        phone1.receiveCall("Rob");
        System.out.println(phone1.getNumber() + "\n");

        PhoneImproved phone2 = new PhoneImproved("+38(067)5554433", "XIAOMI 11T 8/128GB", "203g");
        System.out.println(phone2.model + "\n" + phone2.weight);
        phone2.receiveCall("Mark");
        System.out.println(phone2.getNumber() + "\n");

        PhoneImproved phone3 = new PhoneImproved("+38(063)7778899", "SAMSUNG Galaxy S21 Ultra 12/128 Gb", "228g");
        System.out.println(phone3.model + "\n" + phone3.weight);
        phone3.receiveCall("Alex");
        System.out.println(phone3.getNumber() + "\n");
    }
}
