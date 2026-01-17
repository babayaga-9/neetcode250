class Solution {
    public int getCandidate(int[] nums) {
        int res, count;
        res = 0;
        count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[res]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        return res;
    }
    public int majorityElement(int[] nums) {
        // this is solved with Moore's voting algorithm
        // find candidate, check if that candidate is majority or not
        int majority = getCandidate(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[majority]) {
                count++;
            }
        }
        if (count > (nums.length) / 2) {
            return nums[majority];
        } else {
            return -1;
        }
    }
}
