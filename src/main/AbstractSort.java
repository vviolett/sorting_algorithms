package main;

/**
 * Created by Violetta Bubnova on 1/6/18.
 */
public abstract class AbstractSort {

    public abstract long[] sortArray(long[] arr);

    public void swap(int one, int two, long[] arr) {
        long temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
