package main;

/**
 * Created by Violetta Bubnova on 1/6/18.
 */
public class InsertionSort extends AbstractSort {
    @Override
    public long[] sortArray(long[] arr) {
        int in, out;
        for (out = 1; out < arr.length; out++) // out - разделительный маркер
        {
            long temp = arr[out]; // Скопировать помеченный элемент
            in = out; // Начать перемещения с out
            while (in > 0 && arr[in - 1] >= temp) // Пока не найден меньший элемент
            {
                arr[in] = arr[in - 1]; // Сдвинуть элемент вправо
                --in; // Перейти на одну позицию влево
            }
            arr[in] = temp; // Вставить помеченный элемент
        }
        return arr;
    }
}
