package kmitl.esd.exercise1.strategy;

import java.util.logging.Logger;

public class Main {
    /**
     * ain function to show that the implementation works
     *
     * @return void
     */
    public static void main(String[] args) {
        float[] values = {6.5f,1.5f, 2.5f, 3.5f, 5.0f,0.4f};
        UsSensor usSensor = new UsSensor();
        usSensor.setValues(values);

        AverageMean a =new AverageMean();
        AverageMedian b=new AverageMedian();

        usSensor.setAverage(a);
        float test1 = usSensor.getAverage();
        Logger.getLogger(UsSensor.class.getName()).info(Float.toString(test1));

        usSensor.setAverage(b);
        float test2 = usSensor.getAverage();
        Logger.getLogger(UsSensor.class.getName()).info(Float.toString(test2));


    }
}
