package object5.library.user;

import object5.library.operation.*;

import java.util.Scanner;

public class Admin extends User{


    public Admin(String name) {
        super(name);

        operations = new IOperation[] {
                new ExitOperation(),
                new ListOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation()
        };
    }

    @Override
    public int menu() {
        // 打印管理员的菜单
        System.out.println("=====================");
        System.out.println("欢迎您，" + name + "!");
        System.out.println("1. 查看书籍列表");
        System.out.println("2. 按照名字查找图书");
        System.out.println("3. 新增图书");
        System.out.println("4. 删除图书");
        System.out.println("0. 退出");
        System.out.println("======================");
        System.out.println("请输入您的操作：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
