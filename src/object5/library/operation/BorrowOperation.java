package object5.library.operation;

import object5.library.Book;
import object5.library.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借出操作");
        // 需要让用户输入要借的书的编号.
        System.out.println("请输入要借的书的编号：");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        if(id < 0 || id >= bookList.getSize()){
            System.out.println("错误，输入的编号有误！");
            return;
        }
        // 修改书对应的状态就可以了.
        Book book = bookList.getBook(id);
        if(book.isBorrowed()){
            System.out.println("该书已经被借出");
            return;
        }
        // 此时就把书的借阅状态修改为 true.
        // 此处更严格的写法, 应该是记录一下借阅者的用户 id 之类的信息.
        book.setBorrowed(true);
        System.out.println("借书成功");
    }
}
