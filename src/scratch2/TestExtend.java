package scratch2;

public class TestExtend {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // dog类中并没有定义任何成员变量，name和age属性肯定是从父类Animal中继承下来的
        System.out.println(dog.age);
        System.out.println(dog.name);

        // dog访问的eat()和sleep()方法也是从Animal中继承下来的
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
