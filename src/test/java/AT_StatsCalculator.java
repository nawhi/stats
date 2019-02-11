import org.junit.Test;
import stats.MinMax;
import stats.Stats;
import stats.StatsCalculator;

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class AT_StatsCalculator {

    @Test
    public void return_stats_for_a_number() {

        Set<Integer> numbers = new HashSet<>(asList(1, 2, 3, 4, 5));

        Stats expectedStats = new Stats(
                new MinMax(1, 5),
                3,
                5
        );

        StatsCalculator statsCalculator = new StatsCalculator();
        Stats actualStats = statsCalculator.statsFor(numbers);
        assertEquals(expectedStats, actualStats);
    }
}
