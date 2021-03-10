package pid.exercise.sort;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Provides methods for generating arrays of pseudorandom integers.
 *
 * @author Kwabena Asante-Poku
 */
public class IntArrayGenerator {

    static Random random = new Random();

    /**
     * Generates an array of each integer from 0 to length (exclusive) in a random sequence.
     * @param length Desired length of generated array.
     * @return
     * @throws IllegalArgumentException If length is less than 0.
     */
    public static int[] generateRandomSequence(int length) {
        if (length == 0) {
            return new int[]{};
        }
        if (length < 1) {
            throw new IllegalArgumentException("length has to be 0 or greater");
        }

        int[] array = new int[length];
        for (int i = 0; i < array.length; ++i) {
            array[i] = i;
        }

        List<Integer> list = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());
        Collections.shuffle(list, random);
        int[] shuffledArray = list.stream().mapToInt(i ->i).toArray();
        return shuffledArray;
    }
}
