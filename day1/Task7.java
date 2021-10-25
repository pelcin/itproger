import java.util.Arrays;

/*
Создайте одномерный массив, что будет состоять лишь из чисел с точкой. Выполните
сортировку массива. после чего найдите сумму отрицательных элементов массива
 */
public class Main {

    public static void main(String[] args) {
        float sum = 0;
        float[] nums = new float[] {55.6f, 34.5f, 3.6f, 31.7f};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; ++i){
            if (nums[i] < 0){
                sum += nums[i];
            }
        }
        System.out.println(sum);
    }
}
