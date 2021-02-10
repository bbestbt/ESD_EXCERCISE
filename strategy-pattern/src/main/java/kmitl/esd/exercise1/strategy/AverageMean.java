package kmitl.esd.exercise1.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AverageMean implements Average {

    /**
     *
     * @param values values the used for calculating average mean
     * @return mean
     */
    @Override
    public Float getAverage(float[] values) {
        // sum/num;

        float sum = 0;
        for(int i = 0; i < values.length; i++) {
            sum+=values[i];
        }
        return  sum/values.length;
    }


    }





