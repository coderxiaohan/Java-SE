package boke;

public class MyData {
    public int year;
    public int month;
    public int day;

    //代码块初始化
    {
        year = 2025;
        month = 2;
        day = 25;
        System.out.println("代码块初始化");
    }


//    public MyData(){
//        year = 2025;
//        month = 2;
//        day = 25;
//        System.out.println("调用构造方法");
//    }

    @Override
    public String toString() {
        return "MyData{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public MyData(){
        //System.out.println(year); 注释取消掉，编译会失败
        this(2025,2,25);
    }

    public MyData(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("调用第二个构造方法");
    }

    public void setDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static void main(String[] args) {
        MyData day1 = new MyData();
        MyData day2 = new MyData(2025,2,25);
        System.out.println(day1);

    }
}
