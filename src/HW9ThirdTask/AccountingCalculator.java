package HW9ThirdTask;

public class AccountingCalculator extends SimpleCalculator {

    public double returnOnInvestmentROI(double netIncome, double initialInvestments) {
        return (netIncome / initialInvestments) * 100;
    }

    public void earningsPerShareEPS(int netIncome, int numberOfCommonShares) {
        try {
            double result =  netIncome / numberOfCommonShares;
            System.out.println("The result of EPS: " + result);
        }
        catch (Exception e) {
            System.out.println("Code is broken: " + e.toString());
        }
    }
}
