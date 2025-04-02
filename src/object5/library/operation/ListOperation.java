package object5.library.operation;

import object5.library.Book;
import object5.library.BookList;

public class ListOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查看书籍列表：");
        for(int i = 0; i < bookList.getSize();i++){
            Book book = bookList.getBook(i);
            System.out.println("[" + i +"]" + book);
        }
    }
}
