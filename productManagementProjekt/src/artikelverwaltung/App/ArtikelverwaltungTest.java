package artikelverwaltung;

import java.util.*;

public class ArtikelverwaltungTest {
    public static void main(String[] args) {
        Article[] article = new Article[4];
        article[0] = new Meterware("Gardinenstoff", 7.89, 2, 28);
        article[1] = new Meterware("Teppich", 9.99, 3, 30);
        article[2] = new Stueckware("Knopf 5mm", 0.95, 28);
        article[3] = new Stueckware("Kissenhülle", 4.49, 78);

        System.out.println("**********  Список товаров ***********");
        for (int i = 0; i < article.length; i++) {
            System.out.println(article[i]);
        }

        System.out.println("\n***** Список товаров отсортировать ******");
        Arrays.sort(article);
        double lagerbestand = 0;
        for (int i = 0; i < article.length; i++) {
            lagerbestand += article[i].getEuroLagerbestand();
            System.out.println(article[i]);
        }
        System.out.println("\n***** Список товаров вывести *****");
        System.out.println("Lagerbestand: " + lagerbestand + " EUR");
    }
}
