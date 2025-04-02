package object.extend;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("小猫");
        cat.eat("小鱼");
        cat.sleep();
        cat.meow();

        Dog dog = new Dog();
        dog.setName("大黄");
        dog.eat("骨头");
        dog.sleep();
        dog.bark();
    }
}
