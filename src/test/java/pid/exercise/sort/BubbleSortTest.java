package pid.exercise.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for BubbleSort
 *
 * @author Kwabena Asante-Poku
 */
public class BubbleSortTest {

    /**
     * Assert that sorting an empty array has no effects.
     */
    @Test
    public void sortHasNoEffectWhenArrayIsEmpty() {
        // Arrange
        int[] array = {};
        // Act
        BubbleSort.sort(array);
        // Assert
        assertEquals(0, array.length);
    }

    /**
     * Assert that sorting an array with a single element has no effects.
     */
    @Test
    public void sortHasNoEffectWhenArrayHasSingleElement() {
        // Arrange
        int[] actual = {-1};
        int[] expected = {-1};
        // Act
        BubbleSort.sort(actual);
        // Assert
        assertArrayEquals(expected, actual);
    }

    /**
     * Assert that sorting a three element array results in a correct
     * ordering of the elements.
     */
    @Test
    public void sortThreeElementArrayGivesCorrectOrdering() {
        // Arrange
        int[] actual = {-44, 0, -2};
        int[] expected = actual.clone();
        Arrays.sort(expected); // We expect Arrays.sort to be correct as it is a highly battle-tested implementation.
        // Act
        BubbleSort.sort(actual);
        // Assert
        assertArrayEquals(expected, actual);
    }

    /**
     * Assert that sorting a multiple element array results in a correct
     * ordering of the elements.
     */
    @Test
    public void sortMultipleElementArrayGivesCorrectOrdering() {
        // Arrange
        int[] actual = {-59, 27, 38, 2, 7, -84, 13, 84, -8, 3};
        int[] expected = actual.clone();
        Arrays.sort(expected); // We expect Arrays.sort to be correct as it is a highly battle-tested implementation.
        // Act
        BubbleSort.sort(actual);
        // Assert
        assertArrayEquals(expected, actual);
    }

}
