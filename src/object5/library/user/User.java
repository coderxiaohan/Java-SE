package object5.library.user;

import object5.library.BookList;
import object5.library.operation.IOperation;

public abstract class  User {
    //子类可以直接获取到，就不用搞getter和setter方法了
    protected String name;
    // 当前这个类, 能够进行哪些操作, 就往这个数组中添加对应的对象
    protected IOperation[] operations;

    public User(String name) {
        this.name = name;
    }

    // 显示用户菜单，返回值表示用户输入的序号
    public abstract int menu();

    public void work(int choice, BookList booklist){
        if(choice < 0 || choice >= operations.length){
            System.out.println("输入的选项非法");
            return;
        }
        operations[choice].work(booklist);
    }
}
