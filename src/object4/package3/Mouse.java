package object4.package3;

public class Mouse implements USB{
    public void openDevice(){
        System.out.println("打开鼠标");
    }
    @Override
    public void closeDevice() {
        System.out.println("关闭鼠标");
    }
}
