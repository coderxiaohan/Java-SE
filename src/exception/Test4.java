package exception;

public class Test4 {
    public static void main(String[] args) {
        try{
            int a = 10 / 0;
            String s = null;
            System.out.println(s.length());
            int[] arr = {1, 2, 3};
            System.out.println(arr[4]);
        }catch(ArithmeticException e){
            System.out.println("捕获算术异常");
        }catch (NullPointerException e){
            System.out.println("捕获空指针异常");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("捕获数组下标越界异常");
        } catch (Exception e){
            // 兜底. try 中可能有很多很多种异常. 可能有的异常你遗漏了.
            // 避免因为这样没有处理的异常导致程序崩溃.
            System.out.println("捕获到异常");
        }
    }
}
