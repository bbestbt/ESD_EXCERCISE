package kmitl.esd.exercise1.singleton.registry;

import kmitl.esd.exercise1.model.Company;
import kmitl.esd.exercise1.model.ICompany;

import java.util.HashMap;

/**
 * implementaion of singleton with protected constructor for the registry
 * A company manager can be registerd and unregisterd
 */
public class CompanyManagerRegistry {
    private static CompanyManagerRegistry instance=null; //single instance

    private ICompanyManager companyManager=null; //single company manager for registration

    /**
     * private constructor
     */
    private CompanyManagerRegistry(){

    }

    /**
     * Accessor method for the singleton object
     *
     * @return singleton company manager
     */

    public static CompanyManagerRegistry getInstance() {
        if (instance == null) { //check whether the singleton already exist
            synchronized (CompanyManagerRegistry.class) { //thread safe
                if (instance == null)
                    instance = new CompanyManagerRegistry(); //create singleton object
                }
            }

        return instance;
    }
    /**
     * Registration of company manager
     * Manager can be registered if no manager was registerd or the old manager
     * was un registered.
     * No registration is possible, if manager is already registerd
     *
     * @param  companyManager company manager object, must not be mull
     * @return true (manager was registerd) or false (no registration)
     */
    public Boolean register(CompanyManager companyManager){
        //check if the company manager to be registered is not null
        // and if there is a registered manager
        if(companyManager!=null && this.companyManager==null){
            this.companyManager=companyManager; //registration ok
            return true;
        }else{ //no registration possible
            return false;
        }
    }

    /**
     * Unregistration of company manager that has been registerd before
     * Manager can be unregistered if it was registered before
     * No unregistration is possible, if manager was not registerd
     *
     * @return true(manager was unregistered) or flase (no unregisterd possible)
     */


    public Boolean unregistered(){
        if(this.companyManager!=null){ //check if there is a registered manager
            this.companyManager=null; //unregistration ok
            return true;
        }else{ //no unregistration possible
            return false;
        }

    }

    /**
     * Getter for the registration company manager
     * Note: there is no getter method. Only registration
     *
     * @return company manager or null
     */
    public ICompanyManager getCompanyManager() {
        return companyManager;
    }

    /**
     * factory method for company manager
     * @return company manager
     */
    public CompanyManager createCompanyManager(){
        if (companyManager != null) {
            return null;
        } else {
            return new CompanyManager();
        }
//        companyManager=new CompanyManager();
//        return companyManager;
    }
}