package object5.library.operation;

import object5.library.Book;
import object5.library.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        // 让用户输入新的书籍的信息, 然后把这个新的书放到 BookList 中.
        System.out.println("新增图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名：");
        String name = scanner.next();
        System.out.println("请输入作者：");
        String author = scanner.next();
        System.out.println("请输入价格：");
        double price = scanner.nextDouble();
        System.out.println("请输入类型：");
        String type = scanner.next();
        //书默认未借出
        Book book = new Book(name,author,price,type);

        // 把新的书, 添加到数组的最后一个位置上.
        // BookList 可能已经存在 N 本书了 (size)
        // 这些书对应的下标 [0, N-1]
        // 新的图书, 就放到下标为 N 的位置上即可. 并且把 size 加 1
        // 如果书籍列表已经满了, 暂时不处理. 后续学到顺序表的时候, 看如何实现 "扩容" 操作.
        int size = bookList.getSize();
        bookList.setBook(size, book);
        bookList.setSize(size + 1);
        System.out.println("新增图书完成");
    }
}
