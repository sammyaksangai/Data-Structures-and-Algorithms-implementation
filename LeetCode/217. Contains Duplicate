/*
09-02-2022
https://leetcode.com/problems/contains-duplicate/
*/


import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Hashtable<Integer, Integer> ht = new Hashtable<>(nums.length);
        for(int i = 0; i < nums.length; i++)
        {
            if(ht.containsKey(nums[i]))
                return true;
            ht.put(nums[i], nums[i]);
        }
        return false;
    }
}
