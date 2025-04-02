package object4.package5;

public class Student implements Comparable<Student>{

    // 如何比较两个学生对象之间的大小关系
    private int id;
    private String name;
    private double score;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public static void main(String[] args) {
        Student s1 = new Student(1,"张三",80);
        Student s2 = new Student(2,"李四",90);
        // 此处是手动调用的 compareTo 方法
        System.out.println(s1.compareTo(s2));
    }

    @Override
    public int compareTo(Student o) {
        if(this.score > o.score){
            return 1;
        }else if(this.score < o.score){
            return -1;
        }else{
            // 分数相同，比较id
            if(this.id > o.id){
                return 1;
            }else if(this.id < o.id){
                return -1;
            }else{
                return 0;
            }
        }
    }
}
