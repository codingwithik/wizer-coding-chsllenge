import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Challenge {

    public static void main(String[] args){

        int[] arr = {2, 7, 11, 15};
        int[] arr2 = {3, 2,4};
        int[] arr3 = {1, 2, 3, 4, 5, 6};
        //System.out.println(Arrays.toString(getTarget(arr2, 6)));
        //printTriangle(5);
        rotateArray(arr3, 3);
        System.out.println(Arrays.toString(arr3));

    }

    //Question 3
    public static int[] getTarget(int[] arr, int target){

        int[] result = new int[2];
        // [2,7, 11, 15]
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(target - arr[i], i);
            }else{
                result[0] = i;
                result[1] = map.get(arr[i]);
            }
        }

        return result;

    }

    // Question 2
    public static void rotateArray(int[] arr, int N){
        // [1,2,3,4,5,6]
        // [5,6,1,2,3,4]
        N = N % arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, N - 1);
        reverse(arr, N, arr.length - 1);
    }

    public static void swapIndex(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int i, int j){
        while(i < j){
            swapIndex(arr, i, j);
            i++;
            j--;
        }

    }

    // Question 1
    public static void printTriangle(int h){
        if(h > 10) return;
        int i = 0;
        while(i <= h){
            print(i);
            i++;
        }
    }

    public static void print(int h){
        for(int i = 0; i < h; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
