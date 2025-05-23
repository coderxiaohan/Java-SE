package exception;

public class Test3 {
    public static void main(String[] args) {
        try{
            // 抛出算术异常
//            int a = 10 / 0;

            // 抛出空指针异常
//            String s = null;
//            System.out.println(s.length());

            //抛出数组下标越界异常
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);

            // 发生
        }catch(ArithmeticException e){
            System.out.println("发生运行时异常");
//            System.out.println("发生算术异常");
        }catch (NullPointerException e){
            System.out.println("发生空指针异常");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("发生数组下标越界异常");
        }
    }
}
