package object5.library.operation;

import object5.library.Book;
import object5.library.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("还书操作");
        System.out.println("请输入要还的书的编号：");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        if(id < 0 || id >= bookList.getSize()){
            System.out.println("输入的编号有误！");
            return;
        }
        Book book = bookList.getBook(id);
        if(!book.isBorrowed()){
            System.out.println("该书没有被借走");
            return;
        }
        book.setBorrowed(false);
        System.out.println("还书成功！");
    }
}
