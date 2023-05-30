package HW9SecondTask;

public class Main {
    public static void main(String[] args) {
        int[][] trianglePoints = {{-2, 3}, {-3, -1}, {3, -2}};
        int[][] rectanglePoints = {{-2, 4}, {-2, -12}, {4, -12}, {4, 4}};
        int[][] circleCenterPoint = {{0,0}};

        Shape[] shapes = new Shape[4];
        shapes[0] = new Triangle(trianglePoints, Color.BLUE);
        shapes[1] = new Rectangle(rectanglePoints, Color.WHITE);
        shapes[2] = new Circle(circleCenterPoint, Color.RED , 5);
        shapes[3] = new Triangle(trianglePoints, Color.BLUE);

        System.out.println("Compare: " + (shapes[0].equals(shapes[3])));
        System.out.println("Hash code for shape: " + shapes[2].hashCode());
        System.out.println("To string: " + shapes[2]);

        for (Shape shape : shapes) {
            shape.calculateArea();
            shape.calculatePerimeter();
            shape.paint();
        }
    }
}
