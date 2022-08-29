public class Phone {

    int number;
    String model;
    double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println("Звонит :" + name);
    }

    public void receiveCall(String name , int number) {
        System.out.println("Звонит :" + name + "  Номер телефона :" + number);
    }

    public int getNumber() {
        return number;
    }
}
