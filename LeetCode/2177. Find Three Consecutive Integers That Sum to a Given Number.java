//19-02-2022
//https://leetcode.com/contest/biweekly-contest-72/problems/find-three-consecutive-integers-that-sum-to-a-given-number/

class Solution {
    public long[] sumOfThree(long num) {
        long[] arr = new long[0];
        if(num % 3 != 0)
            return arr;
        long[] arr1 = new long[3];
        arr1[0] = num/3 - 1;
        arr1[1] = num/3;
        arr1[2] = num/3 + 1;
        return arr1;
    }
}
