package kmitl.esd.exercise1.strategy;

/**
 * Interface:
 * a) interface needed when there no implementation of method possible
 * b) internal implementation is not to be shown (hide)
 * c) use-case that needed a specific interface (SOLID)
 * Class:
 * implementation of method possible is desired
 * - abstract class:
 * - concrete class:
 */

import java.util.List;

/**
 * interface for average
 */
public interface Average {
    // kmitl.esd.exercise1.strategy.Average interface is an abstraction of the
    // median and mean algorithm
    // Where is the abstraction ???????????
    // Simplification, filter, loss of information:
    // calculation is NOT here.
    // -> structural inheritance

    /**
     *
     * @param values values the used for calculating
     * @return average
     */
    Float getAverage(float[] values);

}
