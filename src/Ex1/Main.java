package Ex1;

public class Main {
    public static void main(String[] args) {
        Figure triangle1 = new Triangle(5,4);
        Figure triangle2 = new Triangle(4,3);
        Figure rectangle1 = new Rectangle(8,10);
        Figure circle1 = new Circle(10);
        Figure circle2 = new Circle(100);


        Figure[] figures = new Figure[]{triangle1,triangle2, rectangle1, circle1, circle2};
        double summaPerimeter = 0;
        for(Figure figure: figures){
            summaPerimeter += figure.getPerimeter();
        }
        System.out.println("Сумма периметров равна:  "+ summaPerimeter);
    }
}
