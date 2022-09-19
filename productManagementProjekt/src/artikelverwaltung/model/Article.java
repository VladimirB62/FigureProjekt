package artikelverwaltung;

public abstract class Article implements Comparable<Article> {
    private String name;
    private double preis;

    public Article(String name, double preis) {
        this.name = name;
        this.preis = preis;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public double getPreis() {
        return preis;
    }

    @Override
    public int compareTo(Article article) {
        return this.getName().compareToIgnoreCase
                (article.getName());
    }
    public abstract double getEuroLagerbestand();
    @Override
    public String toString() {
        return getName() + " [" + getPreis() + " EUR]";
    }
}
