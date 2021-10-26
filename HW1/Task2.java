//Создайте двумерный массив, в котором найдите минимальный элемент среди всех
//элементов в массиве. Важно учесть, что нахождение минимального элемента должно
//производиться при помощи циклов. Массив:
//int[][] x = { {20, 34, 2}, {9, 12, 18}, {3, 4, 5} };
public class Main {

    public static void main(String[] args) {
        int min = 100000;
        int[][] x = {
                {20, 34, 2},
                {9, 12, 18},
                {3, 4, 5}
        };
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++ ){
                if (x[i][j] < min){
                   min = x[i][j];
                }
            }
        }
        System.out.println("Минимальное значение: " + min);
    }
}
