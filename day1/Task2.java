/*
Создайте переменные и впишите в них ваше имя, фамилию и возраст. Создайте еще
одну переменную и поместите в истинное значение, если вы катались сегодня на машине
или же ложное, если это не так. Выведите все переменные в консоль. Каждую переменную
необходимо вывести с новой строки, кроме переменных Имя и Фамилия.
 */
public class Main {

    public static void main(String[] args) {

        String name = "Nikita";
        String surname = "Korovko";
        short age = 19;
        boolean car = false;

        System.out.println(name + " " + surname);
        System.out.println(age);
        System.out.println(car);
    }
}
