package object4.package6;

public class Student implements Cloneable{

    private int id;
    private String name;
    private double score;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(1,"张三",90);
        Student s2 =  s1.clone();


        System.out.println(s2.getId());
        System.out.println(s2.getName());
        System.out.println(s2.getScore());

        // 使用 == 比较两个引用是否指向同一个对象.
        System.out.println(s2 == s1);

    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }
}
