package HW8FirstTask;

public class AppleModel extends MobilePhone{

    public void isThePhoneLocked(boolean isLocked) {
        if (isLocked) {
            System.out.println("The phone is locked.");
        } else System.out.println("The phone is unlocked and available for using!");
    }

    public void setUpApplication(String application) {
        System.out.println("The application " + application + " is downloaded.");
    }

    public void updateOS() {
        System.out.println("Your OS was updated to the newest version.");
    }
}
