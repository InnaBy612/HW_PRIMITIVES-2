public class Main {
    public static void main(String[] args) {

        int InitialAccount = 570;
        int replenishment = 1350;
        int bonus = 0;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        }
        int FinalAccount = InitialAccount + replenishment + bonus;

        System.out.println("Итоговый счёт: " + FinalAccount);
        System.out.println("Бонус: " + bonus);
    }
}