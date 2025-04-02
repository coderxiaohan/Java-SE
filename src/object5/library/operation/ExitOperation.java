package object5.library.operation;

import object5.library.BookList;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        //只需结束整个程序
        System.out.println("goodbye");
        System.exit(0);
    }
}
