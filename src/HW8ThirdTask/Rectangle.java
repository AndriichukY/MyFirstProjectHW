package HW8ThirdTask;

public class Rectangle extends Shape {

    int x1;
    int y1;
    int x2;
    public Rectangle(int[][] points, String color) {
        super(points, color);
    }

    @Override
    public void calculateArea() {
        int length = Math.abs(this.points[2][0] - this.points[0][0]);
        int width = Math.abs(this.points[1][1] - this.points[0][1]);
        int area = length * width / 2;

        System.out.println("The area of the rectangle is: " + area);
    }
        
    @Override
    public void calculatePerimeter() {
        int length = Math.abs(this.points[2][0] - this.points[0][0]);
        int width = Math.abs(this.points[1][1] - this.points[0][1]);
        int perimeter = 2 * (length + width);

        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}
