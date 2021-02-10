package kmitl.esd.exercise1.strategy;

import java.util.Arrays;
import java.util.List;

public class AverageMedian implements Average {
    // -> structural inheritance

    /**
     *
     * @param values values the used for calculating average median
     * @return median
     */
    @Override
    public Float getAverage(float[] values) {
        // calculate the average
        // sort values
        // determine the index in the middle
        // get the median

        Arrays.sort(values);
        int middle = values.length/2;
        if (values.length%2 == 1) {
            return values[middle];
        } else {
            return (values[middle-1] + values[middle]) / 2.0f;
        }

    }

}
