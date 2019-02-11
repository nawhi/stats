package stats;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;

public class MeanCalculatorShould {

    @Test
    public void calculate_mean_for_a_singleton_set() {

        MeanCalculator calculator = new MeanCalculator();
        Set<Integer> numbers = new HashSet<>(singletonList(1));
        assertEquals(1, calculator.meanFor(numbers), 0.000001);
    }

    @Test
    public void calculate_mean_for_a_larger_set_of_numbers() {

        MeanCalculator calculator = new MeanCalculator();
        Set<Integer> numbers = new HashSet<>(asList(1,2,3,4,5));
        assertEquals(3, calculator.meanFor(numbers), 0.000001);
    }
}