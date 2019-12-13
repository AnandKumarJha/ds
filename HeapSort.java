package sorting;

public class HeapSort {

    private void heapify(int[] arr, int posToBeHeapified, int lengthToBeMeasured) {
        int largest = arr[posToBeHeapified];
        int largestIndex = posToBeHeapified;
        int left = 2 * posToBeHeapified + 1;
        int right = 2 * posToBeHeapified + 2;

        if (left < lengthToBeMeasured && arr[posToBeHeapified] < arr[left]) {
            largest = arr[left];
            largestIndex = left;
        }

        if (right < lengthToBeMeasured && largest < arr[right]) {
            largestIndex = right;
        }

        if (posToBeHeapified != largestIndex) {
            swap(arr, posToBeHeapified, largestIndex);
            heapify(arr, largestIndex, lengthToBeMeasured);
        }
    }

    private void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public void heapSort(int[] arr) {
        for (int i = (arr.length / 2)-1; i >= 0; i--) {
            heapify(arr, i, arr.length);
        }

        for (int i = arr.length-1; i >= 0; i--) {
            swap(arr, 0, i);
            heapify(arr, 0, i);
        }
    }
}
