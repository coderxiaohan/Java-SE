import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        int[] array = {1,2,3};
//        transform(array);
//        for(int num:array){
//            System.out.println(num);
//        nums = [2,7,11,15], target = 9

//        int[] nums = new int[] {2,7,11,15};
//        int target = 9;
//        String result = findIndex(nums,target);
//        System.out.println(result);

//        int[] arr1 = {2, 6, 4, 1};
//        int[] arr2 = {1,2,34,3,4,5,7,23,12};
//        System.out.println(isConOdd(arr1));
//        System.out.println(isConOdd(arr2));

//                int[] arr1 = {2,2,1};
//        int[] arr2 = {4,1,2,1,2};
//        System.out.println(findIndex2(arr1));
//        System.out.println(findIndex2(arr2));
//
//        String arr3 = Arrays.toString(arr2); // 数组转字符串
//        System.out.println(arr3);
//        int[] arr4 = null;
//        arr4 = Arrays.copyOf(arr2,arr2.length);
//        System.out.println(Arrays.toString(arr4));

//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int target = 7;
//        int index = binarySearch(arr, target);
//        System.out.println(index);

//        int[] arr = {9, 7, 5, 2, 3, 6, 1};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));

//        int[] arr = {1, 2, 3, 4, 5, 6};
//        changeSequence(arr);
//        System.out.println(Arrays.toString(arr));

        int[] arr1 = {3, 2, 3};
        int[] arr2 = {2, 2, 1, 1, 1, 2, 2};
        Arrays.sort(arr1);
        // 数组中出现次数超过一半的数字，一定是排好序之后，中间位置的数字。
        System.out.println(arr1[arr1.length/2]);
        int x = findMultiNumber(arr1);
        System.out.println(x);
        Arrays.sort(arr2);
        System.out.println(arr2[arr2.length/2]);
        int y = findMultiNumber(arr2);
        System.out.println(y);

    }

        // 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
    //你可以假设数组是非空的，并且给定的数组总是存在多数元素。
    public static int findMultiNumber(int[] arr){
        int[] hash = new int[100];
        for(int i = 0; i < arr.length; i++){
            hash[arr[i]]++;
        }
        for(int i = 0; i < hash.length; i++){
            if(hash[i] > (arr.length / 2)){
                return i;
            }
        }
        return -1;
    }

//    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
//    public static void changeSequence(int[] arr){
//        int left = 0;
//        int right = arr.length - 1;
//        while(left < right){
//            while(left < right && arr[left] % 2 == 1){
//                left++;
//            }
//            while(left < right && arr[right] % 2 == 0){
//                right--;
//            }
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//        }
//    }
//    public static void changeSequence(int[] arr){
//        int left = 0;
//        int right = arr.length - 1;
//        while(left < right){
//            if(arr[left] % 2 == 0 && arr[right] % 2 == 1){
//                int tmp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = tmp;
//            }
//            left++;
//            right--;
//        }
//    }




////    给定一个整型数组, 实现冒泡排序(升序排序)
//    public static void bubbleSort(int[] array){
//        // 冒几次泡
//        for(int i = 0; i < array.length - 1; i++){
//            // 比较多少次
//            for(int j = 0; j < array.length -i - 1; j++){
//                if(array[j] > array[j+1]){
//                    //交换操作
//                    int temp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = temp;
//                }
//            }
//        }
//    }



//    //        给定一个有序整型数组, 实现二分查找
//    public static int binarySearch(int[] array, int target){
//        int left = 0;
//        int right = array.length;
//        while(left <= right){
//            int mid = (left + right) / 2;
//            if(target < array[mid]){
//                right = mid - 1;
//            } else if (target > array[mid]) {
//                left = mid + 1;
//            }else{
//                return mid;
//            }
//        }
//        return -1;
//    }


//    //    给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素
//    //方法二，异或，n^n = 0, 0^n = n
//    public static int findIndex2(int[] arr){
//        int ret = 0;
//        for(int i = 0; i < arr.length; i++){
//            ret = ret ^ arr[i];
//        }
//        return ret;
//    }

    public static int findIndex1(int[] arr){
        int[] hash = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            hash[arr[i]]++;
        }
        for(int i = 0; i < hash.length; i++){
            if(hash[i] == 1){
                return i;
            }
        }
        return -1;
    }

//        //    给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：
////    如果存在，请返回 true ；否则，返回 false
//    public static boolean isOdd(int num){
//        if(num % 2 == 1){
//            return true;
//        } else{
//            return false;
//        }
//    }
//    public static boolean isConOdd(int[] array){
//        int count = 0;  //定义一个计数器
//        for(int i = 0; i < array.length; i++){
//            if(isOdd(array[i])){
//                count ++;
//                if(count == 3){
//                    return true;
//                }
//            }else{
//                // 碰到偶数，count重置
//                count = 0;
//            }
//        }
//        return false;
//    }

////    给定一个整数数组 nums 和一个整数目标值 target，
////    请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
//    public static String findIndex(int[] array,int target){
//        String res = "[";
//        for(int i = 0; i < array.length; i++){
//            for(int j = i + 1; j < array.length; j++){
//                if(array[i] + array[j] == target){
//                    res  = res + i;
//                    res  = res + ",";
//                    res = res + j;
//                    res = res + "]";
//                }
//            }
//        }
//        return res;
//    }


    //实现一个方法 transform, 以数组为参数,
    // 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
//    public static void transform(int[] array){
//        for(int i = 0; i<array.length; i++){
//            array[i] = array[i] * 2;
//        }
//    }
}
