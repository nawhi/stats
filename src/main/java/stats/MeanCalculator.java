package stats;

import java.util.Set;

class MeanCalculator {
    double meanFor(Set<Integer> numbers) {
        return sumOf(numbers) / numbers.size();
    }

    private double sumOf(Set<Integer> numbers) {
        return numbers.stream().reduce(Integer::sum).orElse(0);
    }
}
