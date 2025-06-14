package scratch6;

import java.security.Key;

public class Computer{
    public void powerOn() {
        System.out.println("开机");
    }
    public void powerOff() {
        System.out.println("关机");
    }

    public void useDevice(USB usb){
        usb.openDevice();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard)usb;
            keyboard.input();
        }
        usb.closeDevice();
    }
}
