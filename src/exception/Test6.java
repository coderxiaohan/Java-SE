package exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test6 {
    public static void func(){
        // 打开一个文件 (后续会详细介绍文件操作的逻辑是咋样的)
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("test.txt");
            // 针对文件进行读取 (也会涉及到抛出 IOException 的情况)
            // 暂时省略

            int n = 10;
            if(n > 0){
                // 一旦这里出现 return, 后续的 close 就执行不到.
                return;
            }
            // 或者抛出异常, 后续的 close 也执行不到
            if (n <= 0) {
                throw new RuntimeException("n <= 0");
            }
            // 当文件使用完毕之后, 一定要进行关闭. 关闭如果不执行, 后果会很严重 (影响到你的年终奖)
            // 如果 close 就是写到这里, 非常有危险的, 可能就调用不到了.
            // 更好的做法, 就是使用 finally.
        }catch(IOException e){
            System.out.println("输入输出异常");
        }finally {
            // 临时这么一写, 后续交代更优雅, 也很可靠的关闭的做法.
            try {
                inputStream.close();
            } catch (IOException e) {

            }
        }

    }
    public static void main(String[] args) {
        func();
    }
}
