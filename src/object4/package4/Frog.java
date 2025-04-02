package object4.package4;

public class Frog extends Animal implements IRunning, ISwimming{
    public Frog(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + "一跳一跳地跑");
    }

    @Override
    public void swim() {
        System.out.println(getName() + "使用四条腿游泳");
    }
}
