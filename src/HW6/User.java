package HW6;

public class User {
    String username = "Unknown";
    private int age;
    String email;
    private String password;
    boolean isActive;
    double amountSpentMoney;
    double amountSpentMoneyDiscount;


    public User() {
    }

    public User(String userName) {
        this.username = userName;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18){
            this.age = 18;
        } else {
            this.age = age;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void makePurchase(double purchasePrice) {
        amountSpentMoney += purchasePrice;
    }

    public void printTotalAmountOfSpentMoney() {
        System.out.println("The total amount of purchase is " + amountSpentMoney);
    }

    public void printTotalAmountOfSpentMoneyWithDiscount() {
        System.out.println("The total amount of purchase with discount is " + amountSpentMoneyDiscount);
    }

    public void printUserInfo() {
        System.out.println(
                        "\n" + "HW6.User name is " + username + "\n"
                        + "The age is " + age + "\n"
                        + "The password is: " + password + "\n"
                        + "The email is: " + email + "\n"
                        + "The user is active: " + isActive
        );
    }

    public void addDiscount(int percent) {
        amountSpentMoneyDiscount = amountSpentMoney - ((amountSpentMoney * percent) / 100);
    }
}
