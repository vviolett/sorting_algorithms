package main;

/**
 * Created by Violetta Bubnova on 1/6/18.
 */
public class MergeSort extends AbstractSort {
    @Override
    public long[] sortArray(long[] arr) {
        long[] workSpace = new long[arr.length];
        recMergeSort(workSpace, 0, arr.length - 1, arr);
        return arr;
    }

    private void recMergeSort(long[] workSpace, int lowerBound,
                              int upperBound, long[] arr) {
        if (lowerBound == upperBound) { //Если один элемент, то сортировки не требуется
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2; // Поиск середины
            // Сортировка нижней половины
            recMergeSort(workSpace, lowerBound, mid, arr);
            // Сортировка верхней половины
            recMergeSort(workSpace, mid + 1, upperBound, arr);
            // Слияние
            merge(workSpace, lowerBound, mid + 1, upperBound, arr);
        }
    }

    private void merge(long[] workSpace, int lowPtr, int highPtr, int upperBound, long[] arr) {
        int j = 0; // Индекс в рабочей области
        int lowerBound = lowPtr;
        int mid = highPtr - 1;
        int n = upperBound - lowerBound + 1; // Количество элементов

        while (lowPtr <= mid && highPtr <= upperBound)
            if (arr[lowPtr] < arr[highPtr]) {
                workSpace[j++] = arr[lowPtr++];
            } else {
                workSpace[j++] = arr[highPtr++];
            }
        while (lowPtr <= mid) {
            workSpace[j++] = arr[lowPtr++];
        }
        while (highPtr <= upperBound) {
            workSpace[j++] = arr[highPtr++];
        }
        for (j = 0; j < n; j++)
            arr[lowerBound + j] = workSpace[j];
    }
}
