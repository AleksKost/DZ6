import java.util.Scanner;

public class Converter {

    private static final double UAH_to_USD = 0.037;
    private static final double UAH_to_EUR = 0.03;
    private static final double USD_to_UAH = 26.7;
    private static final double USD_to_EUR = 0.81;
    private static final double EUR_to_UAH = 32.93;
    private static final double EUR_to_USD = 1.23;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите валюту, которую хотите поменять, гривны/ доллары/ евро" + "\n" + "h / d / e");
        String currency = sc.next();
        System.out.println("Во что вы хотите конвертировать? гривны/ доллары/ евро" + "\n" + "h / d / e");
        String convCurrency = sc.next();
        System.out.println("Введите сумму:");
        double money = sc.nextDouble();

        if (money < 0) {
            System.out.println("Отрицательные числа вводить нельзя");
            return;
        }

        if (currency.equals("h") && convCurrency.equals("d")) {
            System.out.println("UAH to USD : " + convUAhToUSD(money) + " $");
        } else if (currency.equals("h") && convCurrency.equals("e")) {
            System.out.println("UAh to EUR : " + convUAhToEUR(money) + " €");
        } else if (currency.equals("d") && convCurrency.equals("h")) {
            System.out.println("USD to UAH : " + convUSDtoUAh(money) + " UAH");
        } else if (currency.equals("d") && convCurrency.equals("e")) {
            System.out.println("USD to EUR : " + convUSDtoEUR(money) + " €");
        } else if (currency.equals("e") && convCurrency.equals("h")) {
            System.out.println("EUR to UAH : " + convEURtoUAh(money) + " UAH");
        } else if (currency.equals("e") && convCurrency.equals("d")) {
            System.out.println("EUR to USD : " + convEURtoUSD(money) + " €");
        } else {
            System.out.println("К сожалению, у нас нет такой валюты.");
        }
    }

    public static double convUAhToUSD(double money) {
        return money * UAH_to_USD;
    }

    public static double convUAhToEUR(double money) {
        return money * UAH_to_EUR;
    }

    public static double convUSDtoUAh(double money) {
        return money * USD_to_UAH;
    }

    public static double convUSDtoEUR(double money) {
        return money * USD_to_EUR;
    }

    public static double convEURtoUAh(double money) {
        return money * EUR_to_UAH;
    }

    public static double convEURtoUSD(double money) {
        return money * EUR_to_USD;
    }
}
