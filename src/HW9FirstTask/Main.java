package HW9FirstTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double doubleForObject = 22.6;

        Double firstDoubleValue = Double.valueOf(34.7);
        Double secondDoubleValue = Double.valueOf(doubleForObject);
        double  thirdDoubleValue = Double.parseDouble("299.5");

        int intFromDouble = firstDoubleValue.intValue();
        float floatFromDouble = firstDoubleValue.floatValue();
        String stringFromDouble = firstDoubleValue.toString();
        char charFromDouble = firstDoubleValue.toString().charAt(0);
        boolean booleanFromDouble = Boolean.valueOf(firstDoubleValue.toString());
        byte byteFromDouble = firstDoubleValue.byteValue();
        short shortFromDouble = firstDoubleValue.shortValue();
        long longFromDouble = firstDoubleValue.longValue();
        String d = Double.toString(thirdDoubleValue);

        System.out.println("Double value object: " + secondDoubleValue);
        System.out.println("Int value: " + intFromDouble);
        System.out.println("Float value: " + floatFromDouble);
        System.out.println("String value: " + stringFromDouble);
        System.out.println("Char value: " + charFromDouble);
        System.out.println("Boolean value: " + booleanFromDouble);
        System.out.println("Byte value: " + byteFromDouble);
        System.out.println("Short value: " + shortFromDouble);
        System.out.println("Long value: " + longFromDouble);
        System.out.println("String value from double: " + d);
    }
}
