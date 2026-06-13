class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int oneCounter = 0;
        int onesMax = oneCounter;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                oneCounter = 0;
                continue;
            }
            oneCounter++;
            if (onesMax < oneCounter) {
                    onesMax = oneCounter;
                }
        }
        return onesMax;
    }
}