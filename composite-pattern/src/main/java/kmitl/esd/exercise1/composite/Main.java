package kmitl.esd.exercise1.composite;

public class Main {
    public static void main(String[] args) {

        /**
         * Main function to show that the implementation works
         *
         * @return void
         */

        Departments mk = new Departments(1, "Marketing");
        Departments is =new Departments(2,"Insurance");
        mk.addDepartment(is);

        Team nlife = new Team(1,"Non life insurance team");
        Team life = new Team(2, "Life insurance Team");

        is.addDepartment(nlife);
        is.addDepartment(life);

        mk.displayDetails();
//        is.displayDetails();
    }
}