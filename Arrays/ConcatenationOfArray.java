class Solution {
    public int[] getConcatenation(int[] nums) {
        int numLen = nums.length;
        int newArrLength = nums.length * 2;
        int[] arr = new int[newArrLength];
        int i;
        for (i = 0; i < numLen; i++) {
            arr[i] = nums[i];
        }
        for (i = 0; i < numLen; i++) {
            arr[numLen + i] = nums[i];
        }
        return arr;
    }
}
