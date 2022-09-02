public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle('*',Color.RED,4, 6);
        Rectangle rectangle2 = new Rectangle('^',Color.WHITE,7,5);
        Triangle triangle1 = new Triangle('$',Color.RED, 7,3);
        Triangle triangle2 = new Triangle('#',Color.BLACK, 8,3);
        Square square1 = new Square('!',Color.BLACK,5);
        Square square2= new Square('%',Color.RED,6);


        rectangle1.calculateArea();
        square1.calculateArea();
        triangle1.calculateArea();

        Figure figure = new Rectangle('*',Color.RED,6,7);

        figure.calculateArea();

        Figure[] figures = new Figure [6];
        figures[0] = rectangle1;
        figures[1] = rectangle2;
        figures[2] = square1;
        figures[3] = square2;
        figures[4] = triangle1;
        figures[5] = triangle2;

        for (int i = 0; i < figures.length; i++) {
            figures[i].calculateArea();
        }
    }
}