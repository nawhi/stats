package stats;

import java.util.Set;

public class StatsCalculator {
    private MinMaxCalculator minMaxCalculator = new MinMaxCalculator();
    private NumberOfElementsCalculator nelsCalculator = new NumberOfElementsCalculator();
    private MeanCalculator meanCalculator = new MeanCalculator();

    public Stats statsFor(Set<Integer> numbers) {
        return new Stats(
                minMaxCalculator.minMaxFor(numbers),
                nelsCalculator.nels(numbers),
                meanCalculator.meanFor(numbers)
        );
    }
}
