package HW9ThirdTask;

public class SimpleCalculator {

    public double add(double x, double y) {
        return x + y;
    }

    public double sub(double x, double y) {
        return x - y;
    }

    public double multiply(int x, int y) {
        return x * y;
    }

    public void div(int x, int y) {
        try {
            int result = x / y;
            System.out.println("The result of division: " + result);
        }
       catch (Exception e) {
           System.out.println("Code is broken: " + e.toString());
       }
    }
}
