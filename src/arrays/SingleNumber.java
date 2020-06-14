package arrays;

import java.util.HashMap;
import java.util.Map;

/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.
Note:Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory.
*/
public class SingleNumber {
    private int singleNumber(int[] nums)
    {
        Map<Integer, Integer> temp = new HashMap<>();
        for(int i= 0; i <= nums.length-1; i++)
        {
            if(temp.containsKey(nums[i]))
            {
                temp.put(nums[i], temp.get(nums[i]) + 1);
            }
            else {
                temp.put(nums[i],1);
            }
        }
        for(int i= 0; i <= nums.length-1; i++){
            if(temp.get(nums[i]) == 1)
            {
                return nums[i];
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1};
        SingleNumber s = new SingleNumber();
        System.out.println(s.singleNumber(nums));
    }
}



