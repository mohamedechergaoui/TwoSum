package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {



    // Solution 1
    // time compelexty is O(n^2)
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];
    }
     // Solution 2
    // time coplexty O(n) the best soultion
    public int[] twoSum2(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length ; i++) {
            int Target = target-nums[i];
            if(map.containsKey(Target )){
                return new int[]{ i,map.get(Target)};
            }
            map.put(nums[i],i);
        }

        return new int [1];
    }



}












