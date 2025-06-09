package scratch;

public class Main {
    public static void main(String[] args) {
        PetDog dogh = new PetDog(); // 通过new实例化对象
        dogh.name = "阿黄";
        dogh.color = "黑黄";
        dogh.barks();
        dogh.wag();

        PetDog dogs = new PetDog(); // 通过new实例化对象
        dogh.name = "赛虎";
        dogh.color = "棕色";
        dogh.barks();
        dogh.wag();
    }

}
