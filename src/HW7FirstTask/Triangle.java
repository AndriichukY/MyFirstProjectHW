package HW7FirstTask;

public class Triangle extends Shape {

    public Triangle(int[][] points, String color) {
        super(points, color);
    }

    @Override
    public  void calculatePerimeter() {
        double x1 = this.points[0][0];
        double y1 = this.points[0][1];
        double x2 = this.points[1][0];
        double y2 = this.points[1][1];
        double x3 = this.points[2][0];
        double y3 = this.points[2][1];

        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        double perimeter = side1 + side2 + side3;

        System.out.println("The perimeter of the triangle is: " + perimeter);
    }

    @Override
    public void calculateArea() {

        int[] xCoordinates = {this.points[0][0], this.points[1][0], this.points[2][0]};
        int[] yCoordinates = {this.points[0][1], this.points[1][1], this.points[2][1]};

        int minX = Math.min(Math.min(xCoordinates[0], xCoordinates[1]), xCoordinates[2]);
        int maxX = Math.max(Math.max(xCoordinates[0], xCoordinates[1]), xCoordinates[2]);
        int minY = Math.min(Math.min(yCoordinates[0], yCoordinates[1]), yCoordinates[2]);
        int maxY = Math.max(Math.max(yCoordinates[0], yCoordinates[1]), yCoordinates[2]);
        int width = maxX - minX;
        int height = maxY - minY;

        int area = width * height;

        System.out.println("The area of the triangle is: " + area);
    }
}
