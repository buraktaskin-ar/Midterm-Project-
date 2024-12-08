package vize;

public class Demo {
    public static void main(String[] args) {
        ContactInfo contactInfo = new ContactInfo("898-123","05555","taskin@example");
        Person person = new Person("Burak Taşkın", contactInfo);
        Bus bus = new Bus("Mercedes", "35 BBB 35", person, 50,8);

        System.out.println(bus.toString());

        System.out.println("The tax is: " + bus.calculateTax()+" TL");

        Bus bus2 = new Bus(bus);

        System.out.println(bus2.equals(bus));





    }
}
