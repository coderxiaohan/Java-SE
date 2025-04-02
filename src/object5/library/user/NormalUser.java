package object5.library.user;

import object5.library.operation.*;

import java.util.Scanner;

public class NormalUser extends User{
    // 各个子类都有的共性的属性, 直接放到父类中即可
    // private IOperation[] operations;

    public NormalUser(String name) {
        super(name);
        operations = new IOperation[] {
                new ExitOperation(),
                new ListOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    @Override
    public int menu() {
        // 打印用户的菜单
        System.out.println("=====================");
        System.out.println("欢迎您，" + name + "!");
        System.out.println("1. 查看书籍列表");
        System.out.println("2. 按照名字查找图书");
        System.out.println("3. 借阅图书");
        System.out.println("4. 归还图书");
        System.out.println("0. 退出");
        System.out.println("======================");
        System.out.println("请输入您的操作");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
