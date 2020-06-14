package arrays;

//Divide and Conquer approach
class MaxSubarray {
     static int maxSubarray(int[] nums, int l, int r) {

        if(l == r) {
            return nums[l]; //Base Condition
        }

        int m = (l+r)/2;

        return Math.max(Math.max(maxSubarray(nums, l, m),
                maxSubarray(nums, m+1, r)),
                maxCrossingPointSum(nums, l, m, r));

    }

    private static int maxCrossingPointSum(int[] nums, int l, int m, int r) {
        int sum = 0 ;
        int left_sum = 0 , right_sum = 0;
        for(int i = l; i<=m; i++)
        {
            sum += nums[i];
            if(sum > left_sum)
            {
                left_sum = sum;

            }
        }
        sum = 0;
        for(int i = m+1; i<=r; i++)
        {
            sum += nums[i];
            if(sum > right_sum)
            {
                right_sum = sum;

            }
        }
        return Math.max(left_sum + right_sum, Math.max(left_sum, right_sum));
    }

    public static void main (String[] args) {
        int arr[] = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarray(arr, 0, arr.length-1));
    }


}