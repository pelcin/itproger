//Создайте класс Самолет. В этом классе создайте вложенный класс крыло.
// В него добавьте переменную вес и реализуйте метод, который будет показывать вес крыла.
//
//В главном классе создайте объект и добавьте во вложенный класс данные про
// вес крыла, а также выведите информацию на экран. Создайте два объекта и добавьте разный вес для крыльев.
class Main {
    public static void main (String[] args) {
        Airplane boeing = new Airplane();
        Airplane airbus = new Airplane();
        boeing.wing.setWeight(2481f);
        boeing.wing.getWeight();
        airbus.wing.setWeight(3519f);
        airbus.wing.getWeight();

    }
}
