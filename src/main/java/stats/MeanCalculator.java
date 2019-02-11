package stats;

import java.util.Set;

public class MeanCalculator {
    public double meanFor(Set<Integer> numbers) {
        return sumOf(numbers) / numbers.size();
    }

    private double sumOf(Set<Integer> numbers) {
        return numbers.stream().reduce(Integer::sum).get();
    }
}
