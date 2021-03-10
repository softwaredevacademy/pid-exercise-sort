package pid.exercise.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for SelectionSort
 *
 * @author Kwabena Asante-Poku
 */
public class SelectionSortTest {

    /**
     * Assert that sorting an empty array has no effects.
     */
    @Test
    public void sortHasNoEffectWhenArrayIsEmpty() {
        // Arrange
        int[] array = {};
        // Act
        SelectionSort.sort(array);
        // Assert
        assertEquals(0, array.length);
    }

    /**
     * Assert that sorting an array with a single element has no effects.
     */
    @Test
    public void sortHasNoEffectWhenArrayHasSingleElement() {
        // Arrange
        int[] actual = {5};
        int[] expected = {5};
        // Act
        SelectionSort.sort(actual);
        // Assert
        assertArrayEquals(expected, actual);
    }

    /**
     * Assert that sorting a two element array results in a correct
     * ordering of the elements.
     */
    @Test
    public void sortTwoElementArrayGivesCorrectOrdering() {
        // Arrange
        int[] actual = {1, -1};
        int[] expected = actual.clone();
        Arrays.sort(expected); // We expect Arrays.sort to be correct as it is a highly battle-tested implementation.
        // Act
        SelectionSort.sort(actual);
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
        int[] actual = {3, 0, -15, 343, 99, 23, 10, 54, 2, 2, 1};
        int[] expected = actual.clone();
        Arrays.sort(expected); // We expect Arrays.sort to be correct as it is a highly battle-tested implementation.
        // Act
        SelectionSort.sort(actual);
        // Assert
        assertArrayEquals(expected, actual);
    }

}
