package kmitl.esd.exercise1.model;

// derived class, Company is the super class
// ForeignCompany inherits Company
// superclass is not an interface -> behavioral inheritance
public class ForeignCompany extends Company{
    // -> behavioral inheritance

    /**
     * The method used for getting a company type
     *
     * @return company type
     */
    public CompanyType getCompanyType() {
        return CompanyType.FOREIGN;
    }

    /**
     * The method  used for getting the company name
     *
     * @return name
     */

    public String getName() {
        return "Foreign Comp." + name;
    }


}
