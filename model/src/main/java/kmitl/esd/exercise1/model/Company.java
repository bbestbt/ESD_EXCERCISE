package kmitl.esd.exercise1.model;

/**
 * Superclass for the company inh. tree
 */
public abstract class Company implements ICompany {

    private String taxId;

    /**
     * factory method for subclasses
     * @param companyType type of the company
     * @return return an object of the company type
     */
    public static Company create(CompanyType companyType) {
        Company company = null;
        switch (companyType) {
            case LOCAL :
                company=new LocalCompany();
                break;
            case FOREIGN :
                company=new ForeignCompany();
        };
        return company;
    }

    // fields
    protected long id;
    protected String name;

    // Constructor
    public Company() {
    }

    /**
     * The method used for getting id
     *
     * @return id
     */
    public long getId() {
        return id;
    }

    /**
     * The method used for setting id
     *
     * @param id company id
     * @return void
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * The method used for getting name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * The method used for setting name
     *
     * @param name company name
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The method used for getting tax id
     *
     * @return tax id
     */
    public String getTaxId() {
        return this.taxId;
    }
}
