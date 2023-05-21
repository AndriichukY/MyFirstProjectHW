package HW7;

import java.util.Arrays;
import java.util.Objects;

public class Circle extends Shape {

    private int radius;

    public Circle(int[][] points, String color, int radius) {
        super(points, color);
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        boolean pointsEquals = super.equals(o);
        Circle circle = (Circle) o;

        return pointsEquals && Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.deepHashCode(points), color, radius);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "points=" + Arrays.deepToString(points) + "\n" +
                "color=" + color + "\n" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * Math.pow(this.radius, 2);
        System.out.println("The aria of circle is:" + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * Math.PI * this.radius;
        System.out.println("The perimeter of the circle is: " + perimeter);
    }
}
