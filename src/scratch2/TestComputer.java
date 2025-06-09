package scratch2;

import scratch.Computer;

import scratch.Computer;
public class TestComputer {
    public static void main(String[] args) {
        Computer p = new Computer("HW", "i7", "8G", "13*14");
        System.out.println(p.screen);
//        System.out.println(p.cpu); // 报错：cup是私有的，不允许被其他类访问
//        System.out.println(p.brand); // 报错：brand是default，不允许被其他包中的类访问
    }
}

// 注意：如果去掉Computer类之前的public修饰符，代码也会编译失败