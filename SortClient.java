package sorting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SortClient {

    int[] arr = {5, 2, 8, 3, 6, 4, 9};

    @Test
    public void TestMethod(){
        String s = "Hello";
        assertEquals("Hello", s);
    }

    @Test
    public void quickSortTest(){
        printArray(arr);
        System.out.println("After sorting");
//        QuickSort quickSort = new QuickSort();
//        quickSort.quickSort(arr, 0, arr.length-1);
        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(arr);
        printArray(arr);
    }

    private void printArray(int[] arr){
        for(int i : arr){
            System.out.println("" + i);
        }
    }
}
