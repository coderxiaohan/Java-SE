package boke2.extend;

public class Animal {
    public String name;
    private int age;
    public void eat(){
        System.out.println(name + "正在吃饭");
    }

    public Animal(String name){
        this.name = name;
        System.out.println("父类构造方法");
    }
    public void sleep(){
        System.out.println(name + "正在睡觉");
    }

    public void setName(String name) {
        this.name = name;
    }
}
