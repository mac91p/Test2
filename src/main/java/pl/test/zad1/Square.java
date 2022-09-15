package pl.test.zad1;


public class Square extends Figure {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return a * a;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }

    @Override
    public String toString() {
        return super.toString() + "Kwadrat o boku " + a + ".";
    }
}
