package main;

/**
 * Created by Violetta Bubnova on 1/6/18.
 */
public class ShellSort extends AbstractSort {
    @Override
    public long[] sortArray(long[] arr) {
        int inner, outer;
        long temp;
        int h = 1; // Вычисление исходного значения h
        while (h <= arr.length / 3) {
            h = h * 3 + 1;
        } // (1, 4, 13, 40, 121, ...)
        while (h > 0) // Последовательное уменьшение h до 1
        {
            for (outer = h; outer < arr.length; outer++) {
                temp = arr[outer];
                inner = outer;
                // Первый подмассив (0, 4, 8)
                while (inner > h - 1 && arr[inner - h] >= temp) {
                    arr[inner] = arr[inner - h];
                    inner -= h;
                }
                arr[inner] = temp;
            }
            h = (h - 1) / 3; // Уменьшение h
        }
        return arr;
    }
}
