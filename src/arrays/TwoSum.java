package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public Integer[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (!hMap.containsKey(diff)) {
                hMap.put(nums[i], i);
            } else {
                result.add(hMap.get(diff));
                result.add(i);
            }
        }
        return result.toArray(new Integer[result.size()]);
    }
// ANOTHER OPTIMIZATION
//    class Solution
//    {
//        public int[] twoSum(int[] nums, int target)
//        {
//            HashMap<Integer, Integer> hMap = new HashMap<>();
//            for(int i=0; i<nums.length; i++) {
//                int diff = target - nums[i];
//                if(hMap.containsKey(diff)) {
//                    return new int[]{hMap.get(diff), i};
//                }
//                hMap.put(nums[i], i);
//            }
//        }
//    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        TwoSum s = new TwoSum();

        System.out.println(s.twoSum(nums, target));
    }

}

