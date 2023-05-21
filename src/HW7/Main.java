package HW7;

public class Main {
    public static void main(String[] args) {
        int[][] trianglePoints = {{-2, 3}, {-3, -1}, {3, -2}};
        int[][] rectanglePoints = {{-2, 4}, {-2, -12}, {4, -12}, {4, 4}};
        int[][] circleCenterPoint = {{0,0}};

        Shape[] shapes = new Shape[4];
        shapes[0] = new Triangle(trianglePoints, "blue");
        shapes[1] = new Rectangle(rectanglePoints, "white");
        shapes[2] = new Circle(circleCenterPoint,  "tomato", 5);
        shapes[3] = new Triangle(trianglePoints, "blue");

        System.out.println("Compare: " + (shapes[0].equals(shapes[3])));

        for (Shape shape : shapes) {
            shape.calculateArea();
            shape.calculatePerimeter();
            shape.paint();
        }
    }
}
