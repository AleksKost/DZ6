

public class Bank {
    public static void main(String[] args) {
        payment(400);
        payment(2000);
    }

    public static void payment(double money) {
        double credit = 1500;     // Кредит
        double debts = 0;         // Долг
        double overPayment = 0;   // Переплата

        if (money > credit) {
            overPayment = money - credit;
            System.out.println("Переплата составила " + overPayment + " грн");
            System.out.println("Кредит погашен");

        } else if (money == credit) {
            System.out.println("Кредит погашен");
        } else {
            debts = credit - money;
            System.out.println("Ваш долг " + debts + " грн");
        }
    }

}
