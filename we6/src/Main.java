import com.learning.PiggyBank;

public class Main {
    public static void main(String[] args) {
        PiggyBank myPiggy = new PiggyBank("น้องพอใจ");
        myPiggy.showMoney();
        myPiggy.addMoney(20);
        myPiggy.addMoney(50);
        myPiggy.showMoney();
    }
}
