//Выведите числа от -7 до 12. При этом выводите лишь каждое третье число с пропуском -1,
// 5 и 11. Сделайте такой вывод в циклах for и do while.
public class Main {

    public static void main(String[] args) {
        for (int i = -7; i < 12; i+=3){
            if (i != -1 && i != 5 && i != 11){
                System.out.println(i);
            }
        }
    }
}
