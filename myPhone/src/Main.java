public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Phone phone1 = new Phone();
        Phone phone2 = new Phone();

        phone1.number = 1;
        phone1.model = "Samsung";
        phone1.weight = 100;

        phone2.number = 2;
        phone2.model = "Nokia";
        phone2.weight = 150;

        phone1.receiveCall("Karl");
        phone2.receiveCall("Rebecca");

        phone1.getNumber();
        phone2.getNumber();

        phone1.receiveCall("Fill", 123);
        phone2.receiveCall("Tom", 456);
    }
}