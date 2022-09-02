public class Triangle extends Figure{

    int base;
    int height;

    public Triangle(char symbol, Color color, int base, int height) {
        super(symbol, color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea(){
        System.out.println("Площадь треугольника " + (double)base*height/2);
    }
}
