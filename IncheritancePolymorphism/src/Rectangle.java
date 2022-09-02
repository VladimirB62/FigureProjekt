public class Rectangle extends Figure  implements Artist,Paintner{

    int width;
    int height;

    public Rectangle(char symbol, Color color, int width, int height) {
        super(symbol, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea(){
        System.out.println("Площадь прямоугольника " + width*height);
    }

    @Override
    public void drawFigure() {

    }

    @Override
    public void paintFigure() {

    }
}
