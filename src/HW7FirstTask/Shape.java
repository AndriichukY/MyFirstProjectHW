package HW7FirstTask;

import java.util.Arrays;
import java.util.Objects;

public class Shape {
    protected String color;

    protected int[][] points;

    public Shape(int[][] points, String color) {
        this.points = points;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Shape shape = (Shape) o;

        return Arrays.deepEquals(points, shape.points) && color.equals(shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.deepHashCode(points), color);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "points=" + Arrays.deepToString(points) + "\n" +
                "color=" + color +
                '}';
    }

    public void calculateArea() {
        System.out.println("Shape isn't defined.");
    }

    public void calculatePerimeter() {
        System.out.println("Shape isn't defined.");
    }

    public void paint() {
        System.out.println("The shape was painted in " + color + " color.");
    }
}
