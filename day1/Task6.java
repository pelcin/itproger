import java.util.Scanner;

/*
Попросите пользователя ввести два числа после чего выполните операцию деления
над числами. Создайте тернарный оператор, который проверит является ли второе число 0.
Если оно равно нулю, то в результат запишите число 1, иначе результат деления.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите первое число: ");
        float a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        float b = scanner.nextInt();
        float res = b == 0 ? 1 : (a / b);
        System.out.println("Деление чисел равно: " + res);
    }
}
