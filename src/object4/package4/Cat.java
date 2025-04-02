package object4.package4;

public class Cat extends Animal implements IRunning {

    public Cat(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println(getName() + "使用两条腿跑");
    }
}
