package NowCoder;

import java.util.Scanner;

class Data {
    private int x;
    private int y;
    public Data(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
//            MyData data = new MyData(x, y);
//            System.out.println(data.getX() + data.getY());
        }
    }
}
