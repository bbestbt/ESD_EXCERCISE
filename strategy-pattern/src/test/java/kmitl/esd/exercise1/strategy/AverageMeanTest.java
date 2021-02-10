package kmitl.esd.exercise1.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageMeanTest {
    private AverageMean avg = new AverageMean();
    @BeforeEach
    void setUp() {
//        float[] test = {1.0f,2.0f};
    }

    @Test
    void getAverage() {
        assertEquals( 15f, avg.getAverage( new float[]{10.0f, 20.0f}) );
    }
}