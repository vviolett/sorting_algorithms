package main;

/**
 * Created by Violetta Bubnova on 1/6/18.
 */
public class SelectionSort extends AbstractSort {
    @Override
    public long[] sortArray(long[] arr) {
        for (int min = 0; min < arr.length - 1; min++) {
            int elem = min;
            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j] < arr[elem]) {
                    elem = j;
                }
            }
            swap(min, elem, arr);
        }

        return arr;
    }

    public long[] selectionSortReverse(long[] arr) { //Сортировка в обратном порядке
        for (int max = 0; max < arr.length - 1; max++) {
            int elem = max;
            for (int j = max + 1; j < arr.length; j++) {
                if (arr[j] > arr[elem]) {
                    elem = j;
                }
            }
            swap(max, elem, arr);
        }

        return arr;
    }
}
