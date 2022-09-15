package pl.test.zad1;

public class Main {
    public static void main(String[] args) {

        Figure[] figures = {Figure.createSquare(10), Figure.createCircle(20), Figure.createRectangle(10, 20), Figure.createSquare(15)};
        for (Figure f : figures) {
            System.out.println(f);
        }
        for (Figure f : figures) {
            if (f.equals(Figure.createRectangle(10, 20))) {
                System.out.println("tu powinno wejsc");
            }
        }
        System.out.println(getHighestPerimeter(figures));
        System.out.println(getHighestArea(figures));

    }

    static Figure getHighestPerimeter(Figure[] figures) {
        if (figures == null)
            throw new IllegalArgumentException("Brak tablicy");
        int index = 0;
        double maxPerimeterValue = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].calculatePerimeter() > maxPerimeterValue) {
                maxPerimeterValue = figures[i].calculatePerimeter();
                index = i;
            }
        }
        return figures[index];
    }


    static Figure getHighestArea(Figure[] figures) {
        if (figures == null)
            throw new IllegalArgumentException("Brak tablicy");
        int index = 0;
        double maxAreaValue = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].calculateArea() > maxAreaValue) {
                maxAreaValue = figures[i].calculateArea();
                index = i;
            }
        }
        return figures[index];
    }
}
