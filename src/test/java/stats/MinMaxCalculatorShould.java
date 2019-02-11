package stats;

import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class MinMaxCalculatorShould {

    @Test
    public void give_min_and_max_of_singleton_as_itself() {
        MinMaxCalculator calculator = new MinMaxCalculator();
        Set<Integer> numbers = new HashSet<>(Collections.singletonList(1));
        assertEquals(new MinMax(1, 1), calculator.minMaxFor(numbers));
    }

    @Test
    public void give_min_and_max_of_longer_set() {
        MinMaxCalculator calculator = new MinMaxCalculator();
        Set<Integer> numbers = new HashSet<>(asList(1, 2, 3, 4, 5));
        assertEquals(new MinMax(1, 5), calculator.minMaxFor(numbers));
    }



}