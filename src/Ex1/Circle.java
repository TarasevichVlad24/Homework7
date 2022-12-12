package Ex1;

public class Circle extends Figure{
    double P = 3.14;
    int R ;

    public Circle(int R) {
        this.R = R;
        calcPerimeter();
        calcSquare();
    }

    @Override
    public void calcPerimeter() {
        perimeter = 2 * P * R;
        System.out.println("Периметр круга равен:  "+perimeter);
    }

    @Override
    public void calcSquare() {
        square = P*R*R;
        System.out.println("Площадь круга равна:  "+square);

    }
}



