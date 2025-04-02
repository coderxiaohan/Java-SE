package object5.library;

import object5.library.user.Admin;
import object5.library.user.NormalUser;
import object5.library.user.User;

import java.util.Scanner;

// 程序的入口类
public class Main {
    private static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名：");
        String name = scanner.next();
        System.out.println("请输入您的角色：（1. 普通用户， 2. 管理员）");
        int role = scanner.nextInt();
        if(role == 1){
            return new NormalUser(name);
        }else if(role == 2){
            return new Admin(name);
        }else{
            System.out.println("输入的角色有误!");
            return null;
        }
    }

    public static void main(String[] args) {
        //启动程序，构建主逻辑
        //1. 创建书籍管理对象
        BookList bookList = new BookList();
        // 2. 创建用户对象. 具体是管理员, 还是普通用户, 需要让用户来输入.
        //    调用者不关心当前用户是哪种用户, 都是统一处理.
        User user = login();
        // 3. 构建一个主循环.
        while(true){
            // 4. 先显示用户对应的菜单
            int choice = user.menu();
            // 5. 根据序号, 执行对应的操作
            //    给 user 提供一个对应的 "执行" 方法. 最终都是落到不同的 IOperation 对象上.
            user.work(choice,bookList);
        }
    }
}
