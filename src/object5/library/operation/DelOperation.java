package object5.library.operation;

import object5.library.Book;
import object5.library.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        // 用户来输入, 要删除哪本书.
        // 可以是按照书名来删除, 也可以按照序号来删除 [更科学].
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的序号：");
        int index = scanner.nextInt();
        if(index < 0 || index >= bookList.getSize()){
            System.out.println("序号超出范围！");
            return;
        }
        // 如何删除数组中指定序号的元素?
        // 判定当前这个下标是否是最后一个元素.
        if(index == bookList.getSize()-1){
            bookList.setSize(bookList.getSize()-1);
        }else{
            // 先找到最后一本书
            Book lastbook = bookList.getBook(bookList.getSize() - 1);
            // 进行位置替换
            bookList.setBook(index,lastbook);
            // 再size -1
            bookList.setSize(bookList.getSize() - 1);
        }
        System.out.println("删除书籍完成！");
    }
}
