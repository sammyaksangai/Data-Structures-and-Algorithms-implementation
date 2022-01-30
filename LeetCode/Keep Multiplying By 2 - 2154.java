//30-01-2022
//https://leetcode.com/contest/weekly-contest-278/problems/keep-multiplying-found-values-by-two/
//Prob no. 2154

import java.util.Arrays;
import java.util.stream.IntStream;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        HelloWorld h = new HelloWorld();
        int[] nums = {8,19,4,5,15,3};
        int original = 2;
        int returnVal = h.findFinalValue(nums, original);
    }
    public int findFinalValue(int[] nums, int original) {
        if(nums.length == 1)
        {
            if(nums[0] == original)
                return original * 2;
            else
                return original;
        }
        Arrays.sort(nums);
        int res = Arrays.binarySearch(nums, 3);
        boolean test = res > -1 ? true : false;
        
            
        return original;
    }
}
