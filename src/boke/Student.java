package boke;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private double score;
    private static String classRoom;

    public Student(){
        System.out.println("I am Student init()!");
    }
    static{

    }
    //实例代码块
    {
        this.name = "子涵";
        this.age = 18;
        this.gender = "male";
        this.score = 4.0;
        System.out.println("I am instance init()!");
    }

    // 静态代码块
    static {
        classRoom = "计科2002";
        System.out.println("I am static init()!");
    }

    public String getGender() {
        return gender;
    }


    public void setGender(boolean isMale) {
        if(isMale){
            gender = "male";
        } else{
            gender = "female";
        }
    }

    public static void main(String[] args) {
        Student stu = new Student();
    }
}
