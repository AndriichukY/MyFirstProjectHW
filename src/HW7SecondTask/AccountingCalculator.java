package HW7SecondTask;

public class AccountingCalculator extends SimpleCalculator {

    public double returnOnInvestmentROI(double netIncome, double initialInvestments) {
        return (netIncome / initialInvestments) * 100;
    }

    public double earningsPerShareEPS(double netIncome, double numberOfCommonShares) {
        return netIncome / numberOfCommonShares;
    }
}
