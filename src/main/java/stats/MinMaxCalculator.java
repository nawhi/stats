package stats;

import java.util.Set;

import static java.util.Comparator.naturalOrder;

public class MinMaxCalculator {
    public MinMax minMaxFor(Set<Integer> numbers) {
        int min = numbers.stream().min(naturalOrder()).get();
        int max = numbers.stream().max(naturalOrder()).get();
        return new MinMax(min, max);
    }
}
