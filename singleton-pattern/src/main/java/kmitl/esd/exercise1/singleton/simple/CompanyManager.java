package kmitl.esd.exercise1.singleton.simple;

/**
 * implementation of simple singleton with private constrcutor
 */
public class CompanyManager {

    private static CompanyManager INSTANCE ;

    /**
     * Private constructor
     */

    private CompanyManager() {
        //...
    }

    /**
     * Function to get the instance CompanyManager
     *
     * @return INSTANCE singleton instance CompanyManager
     */

    public static CompanyManager getInstance() {
        if (INSTANCE != null) {
            return INSTANCE;
        }

        INSTANCE = new CompanyManager();

        return INSTANCE;
    }

    public void doSthInstance() {
        System.out.println("Sth with the instance");
    }

    public static void doSth() {
        System.out.println("Sth");
    }

}
