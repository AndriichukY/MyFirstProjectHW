package HW8FirstTask;

public class Main {
    public static void main(String[] args) {
        SamsungModel samsungModel = new SamsungModel();
        samsungModel.accessToInternet(true);
        samsungModel.call(123456);

        AppleModel appleModel = new AppleModel();
        appleModel.isThePhoneLocked(false);
        appleModel.setUpApplication("Duolingo");
        appleModel.updateOS();
    }
}
