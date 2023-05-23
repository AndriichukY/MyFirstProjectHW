package HW7SecondTask;

public class FinanceCalculator extends SimpleCalculator {
    public double calculateFutureValue(double principal, double interestRate, int time) {
        return principal * Math.pow(1 + interestRate, time);
    }

    public double calculatePresentValue(double futureValue, double interestRate, int time) {
        return futureValue / Math.pow(1 + interestRate, time);
    }
}
