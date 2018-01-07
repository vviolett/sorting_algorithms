package main;

import java.util.Arrays;

/**
 * Created by Violetta Bubnova on 1/6/18.
 */
public class RadixSort extends AbstractSort {
    @Override
    public long[] sortArray(long[] arr) {
        // Найдем максимальное число, чтобы знать кол-во цифр
        long m = getMax(arr, arr.length);

        // Делаем подсчет сортировки для каждой цифры.
        for (int exp = 1; m / exp > 0; exp *= 10) {
            countSort(arr, arr.length, exp);
        }
        return arr;
    }

    static long getMax(long arr[], int n) {
        long mx = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static void countSort(long arr[], int n, int exp) {
        long output[] = new long[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // Записываем кол-во вхождений разрядов элементов arr[]
        // в соответсующие позиции count[]
        for (i = 0; i < n; i++) {
            count[(int) ((arr[i] / exp) % 10)]++;
        }

        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Формируем output[] сортировкой по каждому разряду, начиная с меньшего
        for (i = n - 1; i >= 0; i--) {
            output[count[(int) ((arr[i] / exp) % 10)] - 1] = arr[i];
            count[(int) ((arr[i] / exp) % 10)]--;
        }

        // Копируем output[] в arr[]
        for (i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}
