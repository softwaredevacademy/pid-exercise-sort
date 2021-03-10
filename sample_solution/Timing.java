package pid.exercise.sort;

import java.util.Arrays;

public class Timing {

    public static void main(String[] args) {
        int[] array = IntArrayGenerator.generateRandomSequence(100000);

        // JVM warmup (kinda)
        BubbleSort.sort(array);
        SelectionSort.sort(array);
        Arrays.sort(array);

        int[] array2 = IntArrayGenerator.generateRandomSequence(100000);
        int[] array3 = IntArrayGenerator.generateRandomSequence(100000);
        int[] array4 = IntArrayGenerator.generateRandomSequence(100000);

        long start = System.nanoTime();
        SelectionSort.sort(array3);
        long end = System.nanoTime();
        System.out.println("Nanotime selection sort: " + (end-start));

        long start2 = System.nanoTime();
        BubbleSort.sort(array2);
        long end2 = System.nanoTime();
        System.out.println("Nanotime bubble sort: " + (end2-start2));

        long start3 = System.nanoTime();
        Arrays.sort(array4);
        long end3 = System.nanoTime();
        System.out.println("Nanotime Arrays.sort(Dual pivot quicksort): " + (end3-start3));
    }

}
