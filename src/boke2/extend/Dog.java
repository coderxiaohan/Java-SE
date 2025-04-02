package boke2.extend;

import java.util.Date;

public class Dog extends Animal {

    public String name = "子类中的name";

    public Dog(){
        super("小黄");
        System.out.println("子类构造方法");
    }

    public void bark(){
        // this.name访问子类的属性
        System.out.println(this.name + "汪汪汪");
        //super.name访问父类的属性
        System.out.println(super.name + "汪汪汪");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
//        dog.eat();
//        dog.sleep();
//        dog.bark();


    }
}
