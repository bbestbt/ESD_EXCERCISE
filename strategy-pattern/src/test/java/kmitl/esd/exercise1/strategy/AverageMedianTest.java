package kmitl.esd.exercise1.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageMedianTest {
    private AverageMedian avg = new AverageMedian();
    @BeforeEach
    void setUp() {
    }

    @Test
    void getAverage() {
        assertEquals( 10.5f, avg.getAverage( new float[]{10.5f, 20f,5.6f}) );
    }
}