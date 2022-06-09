public class Person {
    String fullName;
    int age;

    public void move() {System.out.println("Person moving");}

    public void talk() {System.out.println("Person talking");}

    public Person() {}

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Anatoly", 35);
        person1.move(); person1.talk();
        System.out.println(person2.fullName + ", " + person2.age);
    }
}
