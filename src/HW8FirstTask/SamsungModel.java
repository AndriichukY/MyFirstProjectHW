package HW8FirstTask;

public class SamsungModel implements Mobile{

    public void call(int mobileNumber) {

        if (String.valueOf(mobileNumber).length() != 6) {
            System.out.println("The mobile number is invalid, please input valid number with 10 numbers!");
        }
        else System.out.println("Call to mobile number " + mobileNumber);
    }

    public void accessToInternet(boolean isAccessTrue) {
        if (isAccessTrue) {
            System.out.println("The internet is available");
        } else System.out.println("The internet is not available now");
    }
}
