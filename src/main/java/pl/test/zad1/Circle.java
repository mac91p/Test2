package pl.test.zad1;

public class Circle extends Figure {

    private int r;

    public Circle(int r) {
        super();
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r,2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return super.toString() + "Koło o promieniu " + r + ".";
    }
}
