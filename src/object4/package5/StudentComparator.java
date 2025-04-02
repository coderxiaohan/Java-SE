package object4.package5;

import java.util.Comparator;

// Comparator 和 Comparable 不太一样.
// Comparable 需要把被比较的类, 实现这个接口.
// 而 Comparator 则是创建单独的类, 实现 Comparator 接口

public class StudentComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        // o1 > o2 ==>返回1
        //o1 < o2 ==>返回-1
        //o1 = o2 ==>返回0
        if(o1.getScore() > o2.getScore()){
            return 1;
        }
        if(o1.getScore() < o2.getScore()){
            return -1;
        }
        // 成绩相同比较学号
        if(o1.getId() > o2.getId()){
            return 1;
        }
        if(o1.getId() < o2.getId()){
            return -1;
        }
        // 学号也一样了, 认为相同.
        return 0;
    }
}
