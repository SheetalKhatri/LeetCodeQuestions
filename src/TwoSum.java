import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {

    //Input: nums = [2, 7, 11, 15], target = 9
    //Output: [0, 1]
    //concept: if nums[i] and complement of it both exists in the array, then the sum = target is sure
    //so, find complement of nums[i] first and enter nums[i] in the hashMap
    //check for complement before entering to HashMap next time
    // add complement's index and current index in the arraylist

    //input nums[] and target
    //output ArrayList<Integer>
    //create a hashmap
    //create an arraylist
    //loop on the array of given numbers
    //calculate the complement
    //if you find the complement as key already than add into arraylist
    //else put the nums[i] and index i.e. i on the Hashmap
    // key concept here is the complement of both the numbers will be same if they add up to target
    public static ArrayList<Integer> twoSumHashMap(int[] nums, int target){
        HashMap<Integer, Integer> checkPoint = new HashMap<>();
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if (checkPoint.containsKey(complement)){
                indices.add(checkPoint.get(complement));
                indices.add(i);
            }
            else{
                checkPoint.put(nums[i],i);
            }
        }
        return indices;
    }

    //create an array to return
    //first loop around the array
    //add each value on the index to see if it meets the target
    //insert indices inside the array
    //out of loop return the array
    public static ArrayList<Integer> twoSum(int[] nums, int target) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i =0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    indices.add(i);
                    indices.add(j);
                }
            }
        }
        return indices;
    }



    public static void main(String[] args){
        int[] nums = {0, 1, 2, 3, 4, 5, 16, -11};
        int target = 5;
        System.out.println(twoSum(nums, target));
        System.out.println(twoSumHashMap(nums, target));
        //complement= 5,4,3,2,1,0,11
        //hashMap= [0,0],[1,1],[2,2],[-11,6]
        //indices= [2,3,1,4,0,5]
    }
}
