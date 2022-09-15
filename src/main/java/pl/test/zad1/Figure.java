package pl.test.zad1;

public abstract class Figure {

    private static int counter = 0;

    protected int figureNumber;

    public Figure() {
        figureNumber = ++counter;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public static Square createSquare(int a) {
        if (a <= 0)
            throw new IllegalArgumentException("Ujemna bądź zerowa wartość a");
        else {
            return new Square(a);
        }
    }

    public static Rectangle createRectangle(int a, int b) {
        if (a <= 0 || b <= 0)
            throw new IllegalArgumentException("Ujemna bądź zerowa wartość a i/lub b");
        else {
            return new Rectangle(a, b);
        }
    }

    public static Circle createCircle(int r) {
        if (r <= 0)
            throw new IllegalArgumentException("Ujemnna bądź zerowa wartość r");
        else {

            return new Circle(r);
        }
    }

    @Override
    public String toString() {
        return "Figura nr " + figureNumber + ": ";
    }
}
