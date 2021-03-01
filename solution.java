class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] array = nums;
        int arrayLength = array.length;
        /*This squares all values in the array*/
        for (int index = 0; index < arrayLength; index++) {
            int item = array[index];
            array[index] = item * item;
        }
        /*This sorts all values in the array*/
        for (int index = 0; index < arrayLength - 1; index++) {
            for (int indexSort = 0; indexSort < arrayLength - 1; indexSort++) {
                if (array[indexSort] > array[indexSort + 1]) {
                    int nextVal = array[indexSort + 1];
                    array[indexSort + 1] = array[indexSort];
                    array[indexSort] = nextVal;
                }
            }
        }
        return array;
    }
}
