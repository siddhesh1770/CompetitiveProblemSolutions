
// Author  :  Siddhesh Patil (siddhesh1770)
// Problem Name : 26. Remove Duplicates From Sorted Array
// Time Complexity : O(N)
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 0;
        if (n == 0 || n == 1) return n;
        for (int i = 0; i < n-1; i++)
            if (nums[i] != nums[i+1])
                nums[j++] = nums[i];
        nums[j++] = nums[n-1];
        return j;
    }
}

// Email : hello@siddheshpatil.in
// Websit : https://www.siddheshpatil.in
// GitHub : https://www.github.com/siddhesh1770
// LinkedIn : https://www.linkedin.com/in/siddhesh1770