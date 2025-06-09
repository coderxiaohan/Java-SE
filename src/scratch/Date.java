package scratch;

//public class Date {
//    public int year;
//    public int month;
//    public int day;
//
//    // 构造方法：
//    // 名字与类名相同，没有返回值类型，设置为void也不行
//    // 一般情况下使用public修饰
//    // 在创建对象时由编译器自动调用，并且在对象的生命周期内只调用一次
//    public Date(int year, int month, int day){
//        this.year = year;
//        this.month = month;
//        this.day = day;
//        System.out.println("Date(int,int,int)方法被调用了");
//    }
//
//    public void printDay(){
//        System.out.println(this.year + "/" + this.month + "/" +this.day);
//    }
//    //this引用的是调用成员方法的对象。
//    public static void main(String[] args) {
//        // 此处创建了一个Date类型的对象，并没有显式调用构造方法
//        Date date = new Date(2020, 9, 16);
//        date.printDay();
//
//    }
//}

//public class Date{
//    public int year;
//    public int month;
//    public int day;
//
//    //无参构造方法
//    public Date(){
//        this.year = 2020;
//        this.month = 9;
//        this.day = 16;
//    }
//
//    // 带有三个参数的构造方法
//    public Date(int year, int month, int day){
//        this.year = year;
//        this.month = month;
//        this.day = day;
//    }
//
//    public void printDate(){
//        System.out.println(year + "-" + month + "-" + day);
//    }
//
//    public static void main(String[] args) {
//        Date d = new Date();
//        d.printDate();
//    }
//}

//public class Date{
//    public int year;
//    public int month;
//    public int day;
//
//    // 带有三个参数的构造方法
//    public Date(int year, int month, int day){
//        // 成员变量在定义时，并没有给初始值, 为什么就可以使用呢？
//        System.out.println(this.year);
//        System.out.println(this.month);
//        System.out.println(this.day);
//    }
//
//    public static void main(String[] args) {
//        // 此处a没有初始化，编译时报错：
//        // Error:(24, 28) java: 可能尚未初始化变量a
////        int a;
////        System.out.println(a);
//        Date d = new Date(2021,6,9);
//    }
//}

public class Date{
    public int year = 2020;
    public int month = 9;
    public int day = 16;

    public Date(){
    }
    public Date(int year, int month, int day){
    }

    public void printDay(){
        System.out.println(this.year + "/" + this.month + "/" +this.day);
    }

    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date(2025, 6, 8);
        d1.printDay();
        d2.printDay();
    }
}
