import java.util.Scanner;

//Напишите программу на Java, что будет высчитывать сумму чисел кратных 3 или 5. Числа
// должны быть от 0 до 1000.
public class Main {
    public static void payment(int num1, int num2, int mul1, int mul2) {
        int result = 0;
        for (int i = num1; i < num2; i++) {
            if (i % mul1 == 0 || i % mul2 == 0) {
                result += i;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите диавпозон от: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите диавпозон до: ");
        int number2 = scanner.nextInt();
        System.out.print("Введите первое кратное число: ");
        int multiply1 = scanner.nextInt();
        System.out.print("Введите первое второе число: ");
        int multiply2 = scanner.nextInt();

        payment(number1, number2, multiply1, multiply2);
    }
}
