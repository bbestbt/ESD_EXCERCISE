package kmitl.esd.exercise1.model;

public class LocalCompany extends Company{

    /**
     * The method used for getting company type
     *
     * @return company type
     */
    public CompanyType getCompanyType() {
        return CompanyType.LOCAL;
    }

    /**
     * The method used for getting company name
     *
     * @return name
     */
    public String getName() {
        return "Local Comp." + name;
    }


    public void something() {

    }
}
