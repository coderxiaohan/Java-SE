package object4.package3;

public class Keyboard implements USB{
    @Override
    public void openDevice() {
        System.out.println("打开键盘");
    }
    @Override
    public void closeDevice() {
        System.out.println("关闭键盘");
    }
}
