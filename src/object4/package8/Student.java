package object4.package8;

public class Student {
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

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean equals(Object o){
        if(o == null){
            // this 肯定不是 null
            return false;
        }
        if(this == o){
            //如果两个引用指向同一个对象, 当然值也是相等的
            return true;
        }
        if( !(o instanceof Student)){
            // 传入的参数类型和当前 Student 不匹配.
            return false;
        }
        // 比较两个 Student 的学号是否相同
        Student other = (Student) o;
        return (other.id == this.id);
    }
}
