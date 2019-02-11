package stats;

import java.util.Objects;

public class MinMax {
    private final int min;
    private final int max;

    public MinMax(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MinMax minMax = (MinMax) o;
        return min == minMax.min &&
                max == minMax.max;
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, max);
    }

    @Override
    public String toString() {
        return "MinMax{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }

}
