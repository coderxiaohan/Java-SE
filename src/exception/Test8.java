package exception;

public class Test8 {
    private static int func(){
        try{
            return 1;
        }catch (Exception e){
            return 2;
        }finally {
            return 3;
        }
    }
    public static void main(String[] args) {
        System.out.println(func());
    }
}
