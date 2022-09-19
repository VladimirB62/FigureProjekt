package artikelverwaltung;

public class Meterware extends Article {
    private int breite;
    private int laenge;

    public Meterware(String bezeichnung, double preis, int breite, int laenge) {
        super(bezeichnung, preis);
        this.breite = breite;
        this.laenge = laenge;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public int getBreite() {
        return breite;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public int getLaenge() {
        return laenge;
    }

    public double getMeterLagerbestand() {
        return breite * laenge;
    }

    @Override
    public double getEuroLagerbestand() {
        return getPreis() * (laenge * breite);
    }

    @Override
    public String toString() {
        return "Meterware: " + super.toString() + " Lagermenge: "
                + getMeterLagerbestand() + " m²";
    }
}
