package exception;

import java.io.IOException;

public class Test9 {
    private static void func() throws IOException{
//        // IOException 是受查异常.
//        //手动捕获异常
//        try{
//            throw new IOException("抛出一个IOException");
//        }catch(IOException e){
//            System.out.println("捕获了一个IOException");
//        }

        //声明异常
        throw new IOException("抛出一个IOException");
    }

    public static void main(String[] args) throws IOException {
        func();
    }
}
