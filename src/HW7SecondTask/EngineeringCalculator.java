package HW7SecondTask;

public class EngineeringCalculator extends SimpleCalculator {

    public double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public double calculateExponential(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
