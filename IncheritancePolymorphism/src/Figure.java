public class Figure{

    private char symbol;
    private Color color;

    public Figure(char symbol, Color color) {
        this.symbol = symbol;
        this.color = color;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void calculateArea(){
        System.out.println("Я считаю площадь фигуры");
    }
}
