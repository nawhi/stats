package stats;

import java.util.Objects;

public class Stats {

    private final MinMax range;
    private final int nels;
    private final double mean;

    public Stats(MinMax range, int nels, double mean) {
        this.range = range;
        this.nels = nels;
        this.mean = mean;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "range=" + range +
                ", nels=" + nels +
                ", mean=" + mean +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Stats)) return false;
        Stats stats = (Stats) other;
        return nels == stats.nels &&
                Double.compare(stats.mean, mean) == 0 &&
                Objects.equals(range, stats.range);
    }

    @Override
    public int hashCode() {
        return Objects.hash(range, nels, mean);
    }
}
