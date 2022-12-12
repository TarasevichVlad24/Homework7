package Ex1;

public class Rectangle extends Figure{

    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        calcPerimeter();
        calcSquare();
    }

    @Override
    public void calcPerimeter() {
        perimeter = (a+b)*2;
        System.out.println("Периметр прямоугольника равен: "+ perimeter);
    }

    @Override
    public void calcSquare() {
        square = a*b;
        System.out.println("Площадь прямоугольника равна:  "+square);
    }
}

