public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 1100;
        int rubleToBonusRatio = 100 / 1;

        int bonus = payment > 1000 ? payment / rubleToBonusRatio : 0;

        /*
        int bonus;
        if (payment > 1000) {
            bonus = payment / x;
        } else {
            bonus = 0;
        }
        */

        System.out.println("Баланс: " + (balance + bonus + payment));
        System.out.println("Бонус: " + bonus);
    }
}