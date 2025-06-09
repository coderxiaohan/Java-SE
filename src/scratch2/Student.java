package scratch2;

//public class Student {
//    public String name;
//    public String gender;
//    public int age;
//    public double score;
//    public static String classroom = "403";
//
//    public Student(String name, String gender, int age, double score) {
//        this.name = name;
//        this.gender = gender;
//        this.age = age;
//        this.score = score;
//    }
//
//    public static void main(String[] args) {
//        // 静态成员变量可以直接通过类名访问
//        System.out.println(Student.classroom);
//
//        Student s1 = new Student("张三","男",20,80);
//        Student s2 = new Student("李四","男",18,95);
//        Student s3 = new Student("小红","女",16,96);
//
//        // 也可以通过对象访问：但是classRoom是三个对象共享的
//        System.out.println(s1.classroom);
//        System.out.println(s2.classroom);
//        System.out.println(s3.classroom);
//    }
//}


public class Student {
    private String name;
    private String gender;
    private int age;
    private double score;
    private static String classroom = "403";

    public static String getclassRoom(){
        return classroom;
    }

    public Student(String name, String gender, int age, double score) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.score = score;
    }

    public static void main(String[] args) {
        // 静态成员变量可以直接通过类名访问
        System.out.println(Student.classroom);

        Student s1 = new Student("张三","男",20,80);
        Student s2 = new Student("李四","男",18,95);
        Student s3 = new Student("小红","女",16,96);

        // 也可以通过对象访问：但是classRoom是三个对象共享的
        System.out.println(s1.classroom);
        System.out.println(s2.classroom);
        System.out.println(s3.classroom);
    }
}
