package main;

/**
 * Created by Violetta Bubnova on 1/6/18.
 */
public class QuickSort extends AbstractSort {
    @Override
    public long[] sortArray(long[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    int partition(long arr[], int left, int right) {
        int i = left, j = right;
        long pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j, arr);
                i++;
                j--;
            }
        }

        return i;
    }

    void quickSort(long arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            quickSort(arr, left, index - 1);
        }
        if (index < right) {
            quickSort(arr, index, right);
        }
    }
}
