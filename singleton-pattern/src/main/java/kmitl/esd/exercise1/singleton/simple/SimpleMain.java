package kmitl.esd.exercise1.singleton.simple;

import kmitl.esd.exercise1.model.Company;
import kmitl.esd.exercise1.model.CompanyType;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class SimpleMain {
    /**
     * Main function to show that the implementation works
     *
     * @return void
     */
    public static void main(String args[]) {
        CompanyManager cm = CompanyManager.getInstance();
        List<Company> companyList = new ArrayList<>();
        Company local = Company.create(CompanyType.LOCAL);
        local.setName("local");
        companyList.add(local);

        Logger.getLogger(SimpleMain.class.getName()).info("Simple singleton : " + cm);
    }
}
