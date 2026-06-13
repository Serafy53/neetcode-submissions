class Solution {
    public int[] replaceElements(int[] arr) {
        int maxSeenSoFar = 0;
        int oldValue;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i+1] > maxSeenSoFar) {
                maxSeenSoFar = arr[i+1];
            }
            oldValue = arr[i];
            arr[i] = maxSeenSoFar;

            if (oldValue > maxSeenSoFar) {
                maxSeenSoFar = oldValue;
            }
        }

        arr[arr.length - 1] = -1;
        return arr;
    }
}