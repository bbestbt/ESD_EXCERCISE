package kmitl.esd.exercise1.singleton.registry;
import kmitl.esd.exercise1.model.Company;
import java.util.ArrayList;
import java.util.List;

/**
 * implementation of multion for company manager
 * Single responsibllity: manage companies
 */
class CompanyManager implements ICompanyManager{

   // public static CompanyManager INSTANCE = null; //single instance as static field
    // private static final CompanyManager instance;// option2 for singleton creation

    //company that this object manage
    protected List<Company> companyList = new ArrayList<>();
//protected constructor for multion

    /**
     * protected constructor for multion
     */
    protected CompanyManager() {
        //...
    }

    /**
     * Getter for the companies
     *
     * @return list of company
     */
    @Override
    public List<Company> getCompanyList() {
        return companyList;
    }

    /**
     * Setter for the companies
     *
     * @param companyList list of companies
     */
    @Override
    public void setCompanyList(List<Company> companyList) {

    }

//    /**
//     * Accesor method for singleton object
//     *
//     * @return singleton company manager
//     */
//    public static CompanyManager getInstance() {
//        if (INSTANCE == null) { //check whether the singleton already exist
//            synchronized (CompanyManager.class) { //thread safe
//                if (INSTANCE == null)
//                    INSTANCE = new CompanyManager(); //create singleton object
//                }
//            }
//            return INSTANCE;
//        }
//
//    public void doSthInstance() {
//        System.out.println("Sth with the instance");
//    }
//
//    public static void doSth() {
//        System.out.println("Sth");
//    }

}


