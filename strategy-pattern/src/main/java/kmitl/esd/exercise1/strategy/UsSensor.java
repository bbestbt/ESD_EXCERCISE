package kmitl.esd.exercise1.strategy;

public class UsSensor {

    private Average average;
    private float[] values;

    /**
     * function used to set average
     *
     * @param average
     * @return void
     */
    public void setAverage(Average average) {
        this.average=average;
    }

    /**
     * function used to set values
     *
     * @param values
     * @return void
     */
    public void setValues(float[] values) {
        this.values=values;

    }


    /**
     * function to get average
     * @return
     */
    public float getAverage() {
        return average.getAverage(values);

    }

    public float[] getValues() {
        return values;
    }
}
