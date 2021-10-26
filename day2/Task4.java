import java.util.Scanner;

//Сделайте функцию, которая сравнивает введенные числа от пользователя и возвращает
// результат в виде знаков >, < или =.
public class Main {

    public static void symbol(int a, int b){
        if (a > b)
            System.out.println(a + " > " + b);
        else if (a < b)
            System.out.println(a + " < " + b);
        else
            System.out.println(a + " = " + b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        symbol(a, b);
    }
}
