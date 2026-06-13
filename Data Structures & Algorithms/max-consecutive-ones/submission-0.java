class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int oneCounter = 0;
        int onesMax = oneCounter;
        int onesMin = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                oneCounter = 0;
                continue;
            }
            oneCounter++;
            onesMin = oneCounter;
            if (onesMax < onesMin) {
                    onesMax = onesMin;
                }
        }
        return onesMax;
    }
}