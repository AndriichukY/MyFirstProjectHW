public class Main {
    public static void main(String[] args) {
        User firstUser = new User();
        User secondUser = new User("Yulia");
        User thirdUser = new User("Maria", "test");

        firstUser.setAge(25);
        firstUser.setPassword("Test password");
        firstUser.makePurchase(122.50);
        firstUser.makePurchase(530);
        firstUser.isActive = true;
        firstUser.printUserInfo();
        firstUser.printTotalAmountOfSpentMoney();
        firstUser.addDiscount(15);
        firstUser.printTotalAmountOfSpentMoneyWithDiscount();

        secondUser.setAge(15);
        secondUser.setPassword("*****");
        secondUser.email = "test@gmail.com";
        secondUser.makePurchase(12.65);
        secondUser.makePurchase(29.8);
        secondUser.printUserInfo();
        secondUser.printTotalAmountOfSpentMoney();

        thirdUser.setAge(55);
        thirdUser.makePurchase(122.80);
        thirdUser.printUserInfo();
        thirdUser.printTotalAmountOfSpentMoney();
    }
}