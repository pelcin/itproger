//Напишите программу на Java, что будет высчитывать сумму чисел кратных 3 или 5. Числа
// должны быть от 0 до 1000.
public class Main {

    public static void main(String[] args) {
        int res = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                res += i;
            }
        }
        System.out.println(res);
    }
}
