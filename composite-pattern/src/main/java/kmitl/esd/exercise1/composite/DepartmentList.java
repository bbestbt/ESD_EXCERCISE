package kmitl.esd.exercise1.composite;

import java.util.ArrayList;
import java.util.List;

public class DepartmentList implements Department {
    private Integer id;
    private String name;

    private List<Department> allDepartments;

    public DepartmentList(Integer id, String name) {
        this.setId(id);
        this.setName(name);
        this.allDepartments = new ArrayList<>();
    }

    public void displayDepartmentName() {
        for(Department dept:allDepartments){
            dept.displayDepartmentName();
        }

    }

    public void addDepartment(Department department) {
        allDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        allDepartments.remove(department);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
