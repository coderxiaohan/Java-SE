package object4.package4;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("小猫");
        cat.run();

        Frog frog = new Frog("青蛙");
        frog.run();
        frog.swim();

        Duck duck = new Duck("小鸭");
        duck.fly();
        duck.run();
        duck.swim();
    }
}
