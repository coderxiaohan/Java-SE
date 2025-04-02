package object4.package5;

public class Student2 {
    private int id;
    private String name;
    private double score;

    public Student2(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public double getScore() {
        return score;
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2(1,"张三",80);
        Student2 s2 = new Student2(2,"李四",90);
        StudentComparator comparator = new StudentComparator();
        System.out.println(comparator.compare(s1, s2));

    }
}
