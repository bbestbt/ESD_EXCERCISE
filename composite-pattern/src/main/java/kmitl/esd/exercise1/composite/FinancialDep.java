package kmitl.esd.exercise1.composite;

public class FinancialDep extends DepartmentList implements Department {

//    private Integer id;
//    private String name;

    public FinancialDep(Integer id, String name) {
        super(id, name);
//        this.id = id;
//        this.name = name;
    }

    public void displayDepartmentName() {
        System.out.println(getId()+" "+getName());
//       System.out.println(id +" "+name);
    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

}