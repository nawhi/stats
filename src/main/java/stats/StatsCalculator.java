package stats;

import java.util.Set;

public class StatsCalculator {
    private final MinMaxCalculator minMaxCalculator = new MinMaxCalculator();
    private final NumberOfElementsCalculator nelsCalculator = new NumberOfElementsCalculator();
    private final MeanCalculator meanCalculator = new MeanCalculator();

    public Stats statsFor(Set<Integer> numbers) {
        return new Stats(
                minMaxCalculator.minMaxFor(numbers),
                nelsCalculator.nels(numbers),
                meanCalculator.meanFor(numbers)
        );
    }
}
