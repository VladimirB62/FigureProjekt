public class Main {
    public static void main(String[] args) {

        Printable [] printables = new Printable[6];

        printables[0] = new Magazine("Bild");
        printables[1] = new Magazine("Burda");
        printables[2] = new Magazine("Blonde");
        printables[3] = new Book("Todesruf");
        printables[4] = new Book("Blutige Stufen");
        printables[5] = new Book("Drachenbanner");

        for (Printable printable : printables) {
            printable.print();
        }

        Magazine.printMagazines(printables);
        Book.printBooks(printables);
    }
}