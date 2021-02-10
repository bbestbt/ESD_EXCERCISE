package kmitl.esd.exercise1.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalCompanyTest {

    private static LocalCompany local;
    @BeforeEach
    void setUp() {
        local=new LocalCompany();
        local.setName("local1");
    }

    @Test
    void getCompanyType() {
        assertEquals(local.getCompanyType(), CompanyType.LOCAL);
    }

    @Test
    void getName() {
        assertEquals(local.getName(),"local1");

    }

    @Test
    void something() {
    }
}