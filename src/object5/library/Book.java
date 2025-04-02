package object5.library;

// 通过这个类表示一本书的信息
public class Book {
    //书名
    private String name;
    //作者名
    private String author;
    //价格
    private double price;
    //类型
    private String type;
    // 是否借出
    private boolean isBorrowed;

    public Book(String name, String author, double price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
        this.isBorrowed = false;
    }
    // 提供 getter/setter 方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String toString(){
        return "[" + name + " ,"  + author +" ," + price + " ,"  + type + "," + (isBorrowed ? "已借出" : "未借出") + "]";
    }

}
