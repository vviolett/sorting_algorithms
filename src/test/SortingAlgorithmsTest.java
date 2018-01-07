package test;

import junit.framework.TestCase;
import main.*;

import java.util.Arrays;

/**
 * Created by Violetta Bubnova on 1/6/18.
 */
public class SortingAlgorithmsTest extends TestCase {

    //Отсортрованнй по возрастанию массив
    long[] sortedTestArray = {0, 0, 10, 1000, 1001, 2000, 10000, 100000};
    long[] sortedRightArray = {0, 0, 10, 1000, 1001, 2000, 10000, 100000};
    long[] sortedReverseArray = {100000, 10000, 2000, 1001, 1000, 10, 0, 0};

    // Отсортированный по убыванию массив
    long[] revSortedTestArray = {3000000, 10000, 1999, 100, 100, 7, 1, 1, 0};
    long[] revSortedRightArray = {0, 1, 1, 7, 100, 100, 1999, 10000, 3000000};
    long[] revSortedReverseArray = {3000000, 10000, 1999, 100, 100, 7, 1, 1, 0};

    // Массив, состоящий из одинаковых элементов
    long[] sameElementsTestArray = {77, 77, 77, 77, 77, 77, 77};
    long[] sameElementsRightArray = {77, 77, 77, 77, 77, 77, 77};
    long[] sameElementsReverseArray = {77, 77, 77, 77, 77, 77, 77};

    // Массив, частично упорядоченный по возрастанию
    long[] partlySortedTestArray = {173, 68, 0, 19, 0, 22, 1, 19, 21, 22, 23, 24};
    long[] partlySortedRightArray = {0, 0, 1, 19, 19, 21, 22, 22, 23, 24, 68, 173};
    long[] partlySortedReverseArray = {173, 68, 24, 23, 22, 22, 21, 19, 19, 1, 0, 0};


    public void testSelectionSort() throws Exception {
        SelectionSort selectionSort = new SelectionSort();
        assertTrue(Arrays.equals(selectionSort.sortArray(sortedTestArray), sortedRightArray));
        assertTrue(Arrays.equals(selectionSort.sortArray(sameElementsTestArray), sameElementsRightArray));
        assertTrue(Arrays.equals(selectionSort.sortArray(partlySortedTestArray), partlySortedRightArray));
        assertTrue(Arrays.equals(selectionSort.sortArray(revSortedTestArray), revSortedRightArray));
    }

    public void testSelectionSortReverse() throws Exception {
        SelectionSort selectionSort = new SelectionSort();
        assertTrue(Arrays.equals(selectionSort.selectionSortReverse(sortedTestArray), sortedReverseArray));
        assertTrue(Arrays.equals(selectionSort.selectionSortReverse(sameElementsTestArray), sameElementsReverseArray));
        assertTrue(Arrays.equals(selectionSort.selectionSortReverse(partlySortedTestArray), partlySortedReverseArray));
        assertTrue(Arrays.equals(selectionSort.selectionSortReverse(revSortedTestArray), revSortedReverseArray));
    }

    public void testInsertionSort() throws Exception {
        InsertionSort insertionSort = new InsertionSort();
        assertTrue(Arrays.equals(insertionSort.sortArray(sortedTestArray), sortedRightArray));
        assertTrue(Arrays.equals(insertionSort.sortArray(sameElementsTestArray), sameElementsRightArray));
        assertTrue(Arrays.equals(insertionSort.sortArray(partlySortedTestArray), partlySortedRightArray));
        assertTrue(Arrays.equals(insertionSort.sortArray(revSortedTestArray), revSortedRightArray));
    }

    public void testShellSort() throws Exception {
        ShellSort shellSort = new ShellSort();
        assertTrue(Arrays.equals(shellSort.sortArray(sortedTestArray), sortedRightArray));
        assertTrue(Arrays.equals(shellSort.sortArray(sameElementsTestArray), sameElementsRightArray));
        assertTrue(Arrays.equals(shellSort.sortArray(partlySortedTestArray), partlySortedRightArray));
        assertTrue(Arrays.equals(shellSort.sortArray(revSortedTestArray), revSortedRightArray));
    }

    public void testMergeSort() throws Exception {
        MergeSort mergeSort = new MergeSort();
        assertTrue(Arrays.equals(mergeSort.sortArray(sortedTestArray), sortedRightArray));
        assertTrue(Arrays.equals(mergeSort.sortArray(sameElementsTestArray), sameElementsRightArray));
        assertTrue(Arrays.equals(mergeSort.sortArray(partlySortedTestArray), partlySortedRightArray));
        assertTrue(Arrays.equals(mergeSort.sortArray(revSortedTestArray), revSortedRightArray));
    }

    public void testQuickSort() throws Exception {
        QuickSort quickSort = new QuickSort();
        assertTrue(Arrays.equals(quickSort.sortArray(sortedTestArray), sortedRightArray));
        assertTrue(Arrays.equals(quickSort.sortArray(sameElementsTestArray), sameElementsRightArray));
        assertTrue(Arrays.equals(quickSort.sortArray(partlySortedTestArray), partlySortedRightArray));
        assertTrue(Arrays.equals(quickSort.sortArray(revSortedTestArray), revSortedRightArray));
    }

    public void testSortRad() throws Exception {
        RadixSort radixSort = new RadixSort();
        assertTrue(Arrays.equals(radixSort.sortArray(sortedTestArray), sortedRightArray));
        assertTrue(Arrays.equals(radixSort.sortArray(sameElementsTestArray), sameElementsRightArray));
        assertTrue(Arrays.equals(radixSort.sortArray(partlySortedTestArray), partlySortedRightArray));
        assertTrue(Arrays.equals(radixSort.sortArray(revSortedTestArray), revSortedRightArray));

    }
}