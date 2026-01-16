class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length == 1 || nums.length == 0) {
            return false;
        }
        HashSet<Integer> numbers = new HashSet<Integer>(nums.length);
        numbers.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (numbers.contains(nums[i])) {
                return true;
            } else {
                numbers.add(nums[i]);
            }
        }
        return false;
    }
}
