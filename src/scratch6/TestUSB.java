package scratch6;

public class TestUSB {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        // 使用鼠标设备
        computer.useDevice(new Mouse());

        // 使用键盘设备
        computer.useDevice(new Keyboard());

        computer.powerOff();
    }
}

