import java.util.InputMismatchException;
import java.util.Scanner;

//Попросите пользователя ввести число с клавиатуры. Обрабатывайте ввод данных через
//оператор исключений. Если пользователь введет не число, то выводите в консоль ошибку,
//иначе выведите само число.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
        }catch (InputMismatchException el){
            System.out.println("ERROR: " + el);
        }finally {
            System.out.println("FINISH");
        }
    }
}
