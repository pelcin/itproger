import java.util.Scanner;

//Создайте бесконечный цикл. Каждый раз просите пользователя чтобы тот что-то ввел.
// После того как он введет число 0 вы выйдите из цикла. Если пользователь введет число 1,
// то будет пропущена одна итерация цикла.
public class Main {

    public static void main(String[] args) {
        while (true){
            System.out.println("Введите число: ");
            Scanner scanner = new Scanner(System.in);
            float number = scanner.nextFloat();
            if(number == 0)
                break;
            else if(number == 1)
                continue;
        }
    }
}
