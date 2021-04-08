public class Liang_23_Sorting {
//7.11, 19.5 Selection Sort

/** The method for sorting the numbers */
public static void selectionSort(double[] list) {
    for (int i = 0; i < list.length - 1; i++) {
        // Find the minimum in the list[i..list.length−1]
        double currentMin = list[i];
        int currentMinIndex = i;
        for (int j = i + 1; j < list.length; j++) {
            if (currentMin > list[j]) {
                currentMin = list[j];
                currentMinIndex = j;
            }
        }
        // Swap list[i] with list[currentMinIndex] if necessary
        if (currentMinIndex != i) {
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
        }
    }
}


// 23.2 Insertion Sort
/** The method for sorting the numbers */
public static void insertionSort(int[] list) {
    for (int i = 1; i < list.length; i++) {
        /** Insert list[i] into a sorted sublist list[0..i−1] so that
        list[0..i] is sorted. */
        int currentElement = list[i];
        int k;
        for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
            list[k + 1] = list[k];
        }
        // Insert the current element into list[k + 1]
        list[k + 1] = currentElement;
    }
}


// 23.3 Bubble Sort
// 23.4 Merge Sort
// 23.5 Quick Sort
// 23.6 Heap Sort
// 23.7 Bucket and Radix Sort
// 23.8 External Sort


}
