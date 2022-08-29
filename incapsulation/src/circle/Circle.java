package circle;

public class Circle {

    private double radius;
    private int diameter;


    public Circle(int radius) {
        this.radius = radius;
        this.diameter = radius * 2;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        this.diameter = radius * 2;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
        this.radius = diameter/2;
    }

    public int getDiameter() {
        return diameter;
    }
}
