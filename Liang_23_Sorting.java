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
/** Bubble sort method */
public static void bubbleSort(int[] list) {
    boolean needNextPass = true;
    for (int k = 1; k < list.length && needNextPass; k++) {
        // Array may be sorted and next pass not needed
        needNextPass = false ;
        for (int i = 0; i < list.length − k; i++) {
            if (list[i] > list[i + 1]) {
                // Swap list[i] with list[i + 1]
                int temp = list[i];
                list[i] = list[i + 1];
                list[i + 1] = temp;
                needNextPass = true; // Next pass still needed
            }
        }
    }
}
// 23.4 Merge Sort
/** The method for sorting the numbers */
public static void mergeSort(int[] list) {
    if (list.length > 1) {// Merge sort the first half
        int[] firstHalf = new int[list.length / 2];
        System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
        mergeSort(firstHalf);
        // Merge sort the second half
        int secondHalfLength = list.length − list.length / 2;
        int[] secondHalf = new int[secondHalfLength];
        System.arraycopy(list, list.length / 2,
        secondHalf, 0, secondHalfLength);
        mergeSort(secondHalf);
        // Merge firstHalf with secondHalf into list
        merge(firstHalf, secondHalf, list);
    }
}

/** Merge two sorted lists */
public static void merge(int[] list1, int[] list2, int[] temp) {
    int current1 = 0; // Current
    int current2 = 0; // Current
    int current3 = 0; // Current
    while (current1 < list1.length && current2 < list2.length) {
        if (list1[current1] < list2[current2])
            temp[current3++] = list1[current1++];
        else
            temp[current3++] = list2[current2++];
    }
    while (current1 < list1.length)
        temp[current3++] = list1[current1++];
    while (current2 < list2.length)
        temp[current3++] = list2[current2++];
}
// 23.5 Quick Sort
// 23.6 Heap Sort
// 23.7 Bucket and Radix Sort
// 23.8 External Sort
}
