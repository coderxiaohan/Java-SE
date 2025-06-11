package scratch4;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println(name + "吃骨头");
    }

    public void bark(){
        System.out.println(name + "汪汪汪~");
    }
}
