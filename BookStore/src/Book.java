public class Book implements Printable {

    private String nameBook;

    public Book(String nameBook) {
        this.nameBook = nameBook;
    }

    @Override
    public void print() {
        System.out.println("Печатаю книгу");
    }

    public static void printBooks(Printable[] printable) {
        for (Printable el : printable) {
            if (el instanceof Book) System.out.println("Название книги " + ((Book) el).nameBook);
        }
    }
}
