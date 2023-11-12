class Solution {
    public int missingNumber(int[] arr) {
        cyclicSort(arr);
        return findMissingNumber(arr);
    }

    void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (correct < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    int findMissingNumber(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            if (index != arr[index]) {
                return index;
            }
        }
        return arr.length; // If no missing number is found, return the maximum possible missing number.
    }

    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
