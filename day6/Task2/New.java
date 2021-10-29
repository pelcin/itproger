public class New implements Test{
    public static int count = 0;

    @Override
    public String getMethod(){
        count++;
        return "Метод вызван";
    }
}
