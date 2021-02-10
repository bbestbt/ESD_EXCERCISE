package kmitl.esd.exercise1.singleton.simple;

import kmitl.esd.exercise1.model.Company;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * test for simple singleton implementation of company manager
 */

class CompanyManagerTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getInstance(){
        assertNotEquals(CompanyManager.getInstance(),null);

    }

    @Test
    void doSthInstance() {
    }

    @Test
    void doSth() {
    }
}