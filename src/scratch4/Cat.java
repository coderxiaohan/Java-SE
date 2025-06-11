package scratch4;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println(name + "吃鱼");
    }
    public void mew(){
        System.out.println(name + "喵喵喵~");
    }
}
