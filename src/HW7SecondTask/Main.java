package HW7SecondTask;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        FinanceCalculator financeCalculator = new FinanceCalculator();
        AccountingCalculator accountingCalculator = new AccountingCalculator();
        EngineeringCalculator engineeringCalculator = new EngineeringCalculator();
        ProgramingCalculator programingCalculator = new ProgramingCalculator();

        System.out.println("The result of add is " + simpleCalculator.add(2, 140));
        System.out.println("The result of future value is " + financeCalculator.calculateFutureValue(1888.6, 12, 13));
        System.out.println("The result of sub is " + financeCalculator.sub(178.7, 122.5));
        System.out.println("The result of EPS is " + accountingCalculator.earningsPerShareEPS(29555, 4567.8));
        System.out.println("The result of Square Root is " + engineeringCalculator.calculateSquareRoot(23.55));
        System.out.println("The result of Binary is " + programingCalculator.decimalToBinary(555436));
    }
}
