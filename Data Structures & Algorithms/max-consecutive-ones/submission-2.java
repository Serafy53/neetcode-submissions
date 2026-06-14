class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int oneCounter = 0;
        int oneMax = oneCounter;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                oneCounter = 0;
                continue;
            }
            oneCounter++;
            if (oneMax < oneCounter) {
                oneMax = oneCounter;
            }
        }
        return oneMax;
    }
}