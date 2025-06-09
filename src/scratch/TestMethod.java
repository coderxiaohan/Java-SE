package scratch;

import java.util.Arrays;

public class TestMethod {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.printf("%d\t", arr[row][col]);
            }
            System.out.println("");
        }


//        add(1, 2); // 调用add(int, int)
//        add(1.5, 2.5); // 调用add(double, double)
//        add(1.5, 2.5, 3.5); // 调用add(double, double, double)
//        int[] arr = new int[] {10, 20, 30, 40, 50};
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

//        int[] array = {1, 2, 3};
//        for(int x : array){
//            System.out.println(x);
//        }

//        int[] arr = null;
//        System.out.println(arr[0]);


//        int[] arr = {10, 20, 30};
//        String newArr = Arrays.toString(arr);
//        System.out.println(newArr);

        //执行结果
        //[10, 20, 30]



//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
//
//        //也可以通过[]对数组中的元素进行修改
//        arr[0] = 100;
//        System.out.println(arr[0]);
    }

    public static int add(int x, int y){
        return x + y;
    }
    public static double add(double x, double y){
        return x + y;
    }
    public static double add(double x, double y, double z){
        return x + y + z;
    }
}
