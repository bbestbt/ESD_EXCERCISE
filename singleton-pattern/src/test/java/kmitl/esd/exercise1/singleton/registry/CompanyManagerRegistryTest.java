package kmitl.esd.exercise1.singleton.registry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * test for singleton implementation of companay manager with a registration
 */
class CompanyManagerRegistryTest {
    CompanyManager abcCompanyManager=null;
    Boolean ok=null;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getInstance() {
    }

    @Test
    void prepareRegistration() {
        ok=CompanyManagerRegistry.getInstance().register(abcCompanyManager);
    }

    @Test
    void checkCompanyManagerSingleton() {
        CompanyManager cm1=new CompanyManager();
        CompanyManager cm2=new CompanyManager();
        assertNotNull(cm1);
        assertNotNull(cm2);
        //that is not ok because company manager should be singleton
    }

    @Test
    void register() {
        //case1 successful registration
        CompanyManager abcCompanyManager=new CompanyManager();
        Boolean ok =CompanyManagerRegistry.getInstance().register(abcCompanyManager);
        assertTrue(ok);
        //case2 unsuccessful registration because of existing registration
        CompanyManager defCompanyManager=new CompanyManager();
        Boolean notok=CompanyManagerRegistry.getInstance().register(defCompanyManager);
        assertFalse(notok);
        //case3 unsuccessful registration because of null
        notok=CompanyManagerRegistry.getInstance().register(null);
        assertFalse(notok);
    }

    @Test
    void unregistered() {
        //case1 successful registration and unregistration
        CompanyManager abcCompanyManager=new CompanyManager();
        Boolean ok =CompanyManagerRegistry.getInstance().register(abcCompanyManager);
        assertTrue(ok);
        ok=CompanyManagerRegistry.getInstance().unregistered();
        assertTrue(ok);
        //case2 unsuccessful unregistration
        ok=CompanyManagerRegistry.getInstance().register(abcCompanyManager);
        assertTrue(ok);
        ok=CompanyManagerRegistry.getInstance().unregistered();
        Boolean nook=CompanyManagerRegistry.getInstance().unregistered();
        assertFalse(nook);


    }

    @Test
    void getCompanyManager() {
    }
}