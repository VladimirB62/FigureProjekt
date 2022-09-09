package model;

import model.Figure;
import myEnum.Color;

public class Square extends Figure {

    int side;

    public Square(char symbol, Color color, int side) {
        super(symbol, color);
        this.side = side;
    }

    @Override
    public void calculateArea(){
        System.out.println("Площадь квадрата " + side*side);
    }
}
