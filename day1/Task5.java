import java.util.Scanner;

/*
Попросите пользователя ввести два числа с клавиатуры и попросите чтобы он ввел
арифметическое действие (+, -, *, /). В зависимости от введенного символа выполните 
математические действия над пользовательскими числами. Для этого используйте 
оператор switch case.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите первое число: ");
        float a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        float b = scanner.nextInt();
        System.out.print("Введите арифметическое действие: ");
        char symbol = scanner.next().charAt(0);
        switch (symbol){
            case '+':
                System.out.println("Результат: " + (a + b));
                break;
            case '-':
                System.out.println("Результат:" + (a - b));
                break;
            case '*':
                System.out.println("Результат: " + (a * b));
                break;
            case '/':
                System.out.println("Результат: " + (a / b));
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
