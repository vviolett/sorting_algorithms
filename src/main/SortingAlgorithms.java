package main;

import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Violetta Bubnova on 12/21/17.
 */
public class SortingAlgorithms {
    private static int[] numsOfElements = {100, 500, 1000, 5000, 10000, 50000, 100000};

    public static void main(String[] args) {
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();

        Class<? extends AbstractSort>[] sortingClasses = new Class[]{SelectionSort.class, InsertionSort.class,
                MergeSort.class, ShellSort.class, QuickSort.class, RadixSort.class};

        Timer timer = new Timer();

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("sortingReport.txt"), "utf-8"))) {

            for (Class<? extends AbstractSort> sortingClass : sortingClasses) {
                try {
                    AbstractSort s = sortingClass.newInstance();
                    for (int i : numsOfElements) {

                        for (GenerateArray generateArray : GenerateArray.values()) {
                            long[] arr = sortingAlgorithms.generateArray(i, generateArray);
                            timer.start();
                            s.sortArray(arr);
                            timer.end();
                            writer.write("\n" + sortingClass.getName().substring(5) + " sorted " + i + " elements in " + timer.toString() + " " + generateArray);
                        }
                    }
                    writer.write("\n-----------------------------------");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public long[] generateArray(int max, GenerateArray generateArray) {
        long[] arr = new long[max]; // Создание массива
        long minVal = 0l;
        long maxVal = 3000000000l;
        RadixSort radixSort = new RadixSort();
        SelectionSort selectionSort = new SelectionSort();

        switch (generateArray) {
            case BEST_ARRAY:
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = ThreadLocalRandom.current().nextLong(minVal, maxVal);
                }
                arr = radixSort.sortArray(arr);
                break;
            case WORST_ARRAY:
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = ThreadLocalRandom.current().nextLong(minVal, maxVal);
                }
                arr = selectionSort.selectionSortReverse(arr);
                break;
            case AVERAGE_ARRAY:
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = ThreadLocalRandom.current().nextLong(minVal, maxVal);
                }
                break;
            default:
                System.out.println("Undefined value.");
                break;
        }
        return arr;
    }
}
