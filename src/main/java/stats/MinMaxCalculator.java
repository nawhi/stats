package stats;

import java.util.Set;

import static java.util.Comparator.naturalOrder;

class MinMaxCalculator {
    MinMax minMaxFor(Set<Integer> numbers) {
        int min = numbers.stream().min(naturalOrder()).orElse(0);
        int max = numbers.stream().max(naturalOrder()).orElse(0);
        return new MinMax(min, max);
    }
}
