package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* Write an algorithm to determine if a number n is "happy".
A happy number is a number defined by the following process: Starting with any positive integer,
replace the number by the sum of the squares of its digits, and repeat the process until the number
equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers
 for which this process ends in 1 are happy numbers.
Return True if n is a happy number, and False if not.*/

/* Input: 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1 */

class HappyNumber {
    private boolean isHappy(int sum) {
        List<Integer> digitArray ;
        HashSet<Integer> result = new HashSet<>(); // you need HashSet to prevent it to loop endlessly in a cycle which does not include 1.

        while(sum != 1) {
            if(result.contains(sum)) {
                System.out.println("false");
                return false;
            } else {
                result.add(sum);
                digitArray = getDigitArray(sum);
                sum = getSquareSum(digitArray);
            }
        }
        System.out.println("true");
        return true;
    }

    List<Integer> getDigitArray(int num) {
        List<Integer> numArray = new ArrayList<>();
        while( num != 0 ) {
            numArray.add(num % 10);
            num = num/10;
        }
        return numArray;
    }

    int getSquareSum(List<Integer> arr){
        int sum = 0;
        for(int i=0; i <= arr.size()-1; i++) {
            sum += arr.get(i)*arr.get(i);
        }
        return sum;
    }


    public static void main(String[] args) {
        HappyNumber s = new HappyNumber();
        s.isHappy(11);
    }
}