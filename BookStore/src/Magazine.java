public class Magazine implements Printable {

    private final String nameMagazine;

    public Magazine(String nameMagazine) {
        this.nameMagazine = nameMagazine;
    }

    @Override
    public void print() {
        System.out.println("Печатаю журнал");
    }


    public static void printMagazines(Printable[] printable) {
        for (Printable el : printable) {
            if (el instanceof Magazine) System.out.println("Название журнала " + ((Magazine) el).nameMagazine);
        }
    }
}
