package stats;

import java.util.Set;

import static java.util.Comparator.naturalOrder;

public class MinMaxCalculator {
    public MinMax minMaxFor(Set<Integer> numbers) {
        int max = numbers.stream().min(naturalOrder()).get();
        int min = numbers.stream().max(naturalOrder()).get();
        return new MinMax(min, max);
    }
}
