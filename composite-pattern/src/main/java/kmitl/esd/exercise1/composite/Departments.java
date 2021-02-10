package kmitl.esd.exercise1.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Departments implements BusinessUnit {
    private Integer id;
    private String name;

    private List<BusinessUnit> departmentList;

    /**
     * constuctor
     * @param id id of department
     * @param name name of department
     */
    public Departments(Integer id, String name) {
        this.id=id;
        this.name=name;
        this.departmentList = new ArrayList<>();
    }

    /**
     * function used to display details
     *
     * @return void
     */
    @Override
    public void displayDetails() {
        Logger.getLogger(Departments.class.getName()).info(id + "  " + name);

        for(BusinessUnit bu:departmentList){
            bu.displayDetails();
        }

    }

    /**
     * function to add department
     *
     * @param bu  parameter to add department
     * @return void
     */
    public void addDepartment(BusinessUnit bu) {
        departmentList.add(bu);
    }

    /**
     * function to remove department
     *
     * @param bu parameter to remove department
     * @return void
     */
    public void removeDepartment(BusinessUnit bu) {
        departmentList.remove(bu);
    }



}
