class Solution {
    public int[] replaceElements(int[] arr) {
        int maxSeenSoFar = arr[arr.length - 1];
        int oldValue;
        for (int i = arr.length - 2; i >= 0; i--) {
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