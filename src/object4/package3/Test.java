package object4.package3;

public class Test {
    public static void main(String[] args) {
        USB usb = new Mouse();
        usb.openDevice();
        usb.closeDevice();
    }
}
