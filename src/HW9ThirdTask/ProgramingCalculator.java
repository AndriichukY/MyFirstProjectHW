package HW9ThirdTask;

public class ProgramingCalculator extends SimpleCalculator {

    public String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }
}
