import java.util.Scanner;

public class Nums {

    public static void main(String[] args) {
        System.out.println("Введите число с клавиатуры");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Nums.CheckAM(n);
        Nums.CheckEasy(n);
        Nums.CheckDiv(n);

    }

    private static void CheckAM(int n) {
        if (n >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    private static void CheckEasy(int n) {

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Число не простое");
                return;
            }
        }
        System.out.println("Число простое");
    }

    private static void CheckDiv(int n) {
        if ((n % 2 == 0) && (n % 5 == 0) && (n % 3 == 0) && (n % 6 == 0) && (n % 9 == 0)) {
            System.out.println("Число делится нацело");
        } else {
            System.out.println("Число не делится нацело");
        }
    }
}

