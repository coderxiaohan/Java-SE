package object5.library.operation;

import object5.library.Book;
import object5.library.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找操作");
        System.out.println("请输入你要查找的书籍名称：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        // 遍历书籍列表, 依次取出每个书籍, 判定书名是否一致. 如果一致就打印.
        for(int i = 0; i < bookList.getSize(); i++){
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                System.out.println(book);
            }
        }
        System.out.println("查找完毕");
    }
}
