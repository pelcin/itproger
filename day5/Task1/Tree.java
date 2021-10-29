public class Tree {
    protected int age;
    protected String name;
    protected boolean isLive;

    Tree(){
        System.out.println("Пустой конструктор без параметров сработал!");
    }

    Tree(int age, String name){
        this.age = age;
        this.name = name;
    }

    Tree(int age, String name, boolean isLive){
        this.age = age;
        this.name = name;
        this.isLive = isLive;
    }
}
