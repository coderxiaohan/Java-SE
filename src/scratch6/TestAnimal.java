package scratch6;

public class TestAnimal {
    public static void walk(IRunning iRunning){
        System.out.println("我带着伙伴去散步");
        iRunning.run();
    }
    public static void main(String[] args) {
        Cat cat = new Cat("小猫");
        walk(cat);

        Frog frog = new Frog("青蛙");
        walk(frog);

        Robot robot = new Robot("机器人");
        walk(robot);
    }
}



