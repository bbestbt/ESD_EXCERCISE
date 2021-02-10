package kmitl.esd.exercise1.singleton.registry;

import kmitl.esd.exercise1.model.Company;
import kmitl.esd.exercise1.model.CompanyType;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class RegistryMain {
    /**
     * Main function to show that the implementation works
     *
     * @return void
     */
    public static void main(String args[]) {
        CompanyManagerRegistry regis = CompanyManagerRegistry.getInstance();
        regis.register(regis.createCompanyManager());
        ICompanyManager companyManager = regis.getCompanyManager();

        List<Company> cm = new ArrayList<>();
        Company foreign=Company.create(CompanyType.FOREIGN);
        Company local=Company.create(CompanyType.LOCAL);
        cm.add(foreign);
        cm.add(local);

        companyManager.setCompanyList(cm);

        Logger.getLogger(RegistryMain.class.getName()).info(companyManager.getCompanyList().toString());
    }
}
