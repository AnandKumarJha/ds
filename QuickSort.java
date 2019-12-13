package sorting;

public class QuickSort {

    private int partition(int[] arr, int start, int end) {
        int startPointer = start + 1, endPointer = end;
        int pivot = arr[start];
        while (startPointer < endPointer) {
            while (pivot > arr[startPointer]) {
                startPointer++;
            }
            while (pivot < arr[endPointer]) {
                endPointer--;
            }
            if (startPointer < endPointer) {
                swap(arr, startPointer, endPointer);
            } else {
                swap(arr, start, endPointer);
            }
        }
        return endPointer;
    }

    private void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public void quickSort(int[] arr, int start, int end) {
        if (end > start) {
            int j = partition(arr, start, end);
            quickSort(arr, start, j - 1);
            quickSort(arr, j + 1, end);
        }
    }
}
