package object5.library.operation;

import object5.library.BookList;

public interface IOperation {
    // 给出抽象方法，
    // 此处操作的work方法，是针对“书”来进行的
    void work(BookList bookList);
}
