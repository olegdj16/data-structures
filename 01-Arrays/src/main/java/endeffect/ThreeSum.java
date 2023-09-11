package endeffect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeNumSum(int[] array, int target) {

        Arrays.sort(array);
        List<List<Integer>> triplets = new ArrayList<>();

        for(int i = 0; i < array.length - 2; i++){
            int left = i + 1;
            int right = array.length - 1;
            while( left < right){
                int currentSum = array[i] + array[left] + array[right];
                if(currentSum == target){
                    triplets.add(Arrays.asList(array[i], array[left], array[right]));
                    left++;
                    right--;
                }else if(currentSum < target){
                    left++;
                }else if(currentSum > target){
                    right--;
                }
            }
        }
        return triplets;
    }

    public static void main(String[] args) {
        int[] array1=new int[]{12, 3, 1, 2, -6, 5, -8, 6};
        threeNumSum(array1,6).forEach(System.out::println);
    }
}
