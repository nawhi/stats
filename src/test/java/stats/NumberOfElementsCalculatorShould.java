package stats;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.Assert.*;

public class NumberOfElementsCalculatorShould {

    @Test
    public void calculate_the_number_of_elements_for_singleton_set() {
        NumberOfElementsCalculator calculator = new NumberOfElementsCalculator();
        Set<Integer> numbers = new HashSet<>(singletonList(1));
        assertEquals(1, calculator.nels(numbers));
    }

    @Test
    public void calculate_the_number_of_elements_for_larger_set() {
        NumberOfElementsCalculator calculator = new NumberOfElementsCalculator();
        Set<Integer> numbers = new HashSet<>(asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        assertEquals(10, calculator.nels(numbers));
    }
}