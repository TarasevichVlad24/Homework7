package Ex1;

public class Triangle extends Figure {

    int side;
    int high;

    public Triangle(int side, int high) {
        this.side = side;
        this.high = high;
        calcPerimeter();
        calcSquare();

    }

    @Override
    public void calcPerimeter() {
        perimeter = side * 3;
        System.out.println("Периметр треугольника равен:  "+ perimeter);
    }

    @Override
    public void calcSquare() {
        square = (0.5*side*high);
        System.out.println("Площадь треугольника равна"+square);
    }
}

