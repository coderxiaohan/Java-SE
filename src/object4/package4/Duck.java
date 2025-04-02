package object4.package4;

public class Duck extends Animal implements IFlying,ISwimming,IRunning{

    public Duck(String name){
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + "扑扇翅膀飞");
    }

    @Override
    public void run() {
        System.out.println(getName() + "大摇大摆地跑");
    }

    @Override
    public void swim() {
        System.out.println(getName() + "扑闪翅膀游泳");
    }
}
