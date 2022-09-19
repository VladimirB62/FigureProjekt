package artikelverwaltung;

public class Stueckware extends Article {
    private int anzahl;

    public Stueckware(String bezeichnung, double preis, int anzahl)
    {
        super(bezeichnung, preis);
        this.anzahl = anzahl;
    }

    public int getAnzahl()
    {
        return anzahl;
    }

    public void setAnzahl(int anzahl)
    {
        this.anzahl = anzahl;
    }

    @Override
    public double getEuroLagerbestand()
    {
        return getPreis() * anzahl;
    }

    @Override
    public String toString()
    {
        return "Stückware: " + super.toString()
                + " Lagermenge: " + anzahl + " Stück";
    }
}
