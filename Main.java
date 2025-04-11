public class RobustArraySorter {

    /**
     * Sorts an array of integers in ascending order using the bubble sort algorithm.
     *
     * @param inputArray The array to be sorted.
     * @return The sorted array, or the original array if it's null or empty.
     */
    public static int[] sortArrayAscending(int[] inputArray) {
        // Handle null or empty input arrays
        if (inputArray == null || inputArray.length <= 1) {
            return inputArray; // Already sorted or empty
        }

        int n = inputArray.length;

        // Outer loop iterates through the array
        for (int i = 0; i < n - 1; i++) {
            // Inner loop compares adjacent elements
            for (int j = i + 1; j < n; j++) {
                // If elements are in the wrong order, swap them
                if (inputArray[i] > inputArray[j]) {
                    // Swap inputArray[i] and inputArray[j]
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
        // Return the sorted array
        return inputArray;
    }

    public static void main(String[] args) {
        // Test case 1: Unsorted array
        int[] unsortedArray = {5, 1, 4, 2, 8, 0, -1, 100, -50};
        int[] sortedArray = sortArrayAscending(unsortedArray);

        // Print the sorted array
        if (sortedArray != null) {
            System.out.println("Sorted Array:");
            for (int element : sortedArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        } else {
            System.out.println("Input array was null.");
        }

        // Test case 2: Empty array
        int[] emptyArray = {};
        int[] sortedEmptyArray = sortArrayAscending(emptyArray);
        System.out.println("Sorted empty array's length: " + sortedEmptyArray.length);

        // Test case 3: Single element array
        int[] singleElementArray = {3};
        int[] sortedSingleElementArray = sortArrayAscending(singleElementArray);
        System.out.println("Sorted single array's first value: " + sortedSingleElementArray[0]);

        // Test case 4: Null array
        int[] nullArray = null;
        int[] sortedNullArray = sortArrayAscending(nullArray);
        if(sortedNullArray == null){
            System.out.println("null array handled correctly");
        }
    }
}
