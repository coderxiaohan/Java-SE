package scratch4;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println(name + "吃饭");
    }
}
