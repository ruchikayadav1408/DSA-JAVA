//https://leetcode.com/problems/most-frequent-number-following-key-in-an-array/

class Solution {
    public int mostFrequent(int[] nums, int key) {
         int[] cnt = new int[1001];
            int ans = 0, mx = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length - 1; ++i) {
                if (nums[i] == key) {
                    if (mx < ++cnt[nums[i+1]]) {
                        mx = cnt[nums[i+1]];
                        ans = nums[i+1];
                    }
                }
            }
            return ans;
    }
}
