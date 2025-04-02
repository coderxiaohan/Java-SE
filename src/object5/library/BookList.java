package object5.library;

//通过这个类管理多个书籍
public class BookList {
    // 此处的最大长度可以灵活设置
    // 这个数组的所有元素默认都是null
    private Book[] books = new Book[1024];
    // 当前数组的有效元素的个数
    private int size = 0;

    public BookList() {
        // 默认填写几本书进去. 方便后续的测试.
        // 就可以直接按照任意顺序实现 Operation , 而无需先实现 AddOperation.
        books[0] = new Book("西游记", "吴承恩",100,"古典小说");
        books[1] = new Book("红楼梦", "曹雪芹",120,"古典小说");
        books[2] = new Book("高等数学", "同济大学",80,"数学");
        books[3] = new Book("Java从入门到精通", "abc",110,"计算机");
        size = 4;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Book getBook(int index){
        return books[index];
    }

    public void setBook(int index, Book book){
        books[index] = book;
    }

// 此处发现, 针对数组属性生成的 getter 和 setter, 是针对整个数组来进行的.
    // 更希望看到的是针对某个数组元素的 getter 和 setter.

//    public Book[] getBooks() {
//        return books;
//    }
//
//    public void setBooks(Book[] books) {
//        this.books = books;
//    }

}
