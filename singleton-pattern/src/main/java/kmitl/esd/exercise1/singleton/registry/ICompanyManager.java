package kmitl.esd.exercise1.singleton.registry;

import kmitl.esd.exercise1.model.Company;

import java.util.List;
/**
 * interface for company manager
 */


public interface ICompanyManager {

    /**
     * get all companies
     * @return list of companies
     */
    List<Company> getCompanyList();

    /**
     * set the list of companies
     * @param companyList
     */

    void setCompanyList(List<Company> companyList);
}
