class Solution {
    public int[] replaceElements(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            temp = arr[i + 1];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > temp) {
                    temp = arr[j];
                }
            }
            arr[i] = temp;
        }
        arr[arr.length - 1] = -1;

        return arr;
    }
}