package kmitl.esd.exercise1.composite;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentsTest {
    Departments dept;
    @BeforeEach
    void setUp() {
        dept = new Departments(100, "test dept");
    }

    @Test
    void displayDetails() {
    }

    @Test
    void addDepartment() {
        Departments d1 = new Departments(101, "IT");
        Departments d2 = new Departments(102, "Commercial");

        dept.addDepartment(d1);
        dept.addDepartment(d2);

    }

    @Test
    void removeDepartment() {
        Departments d3 = new Departments(103, "test1");
        Departments d4 = new Departments(104, "test2");

        dept.addDepartment(d3);
        dept.addDepartment(d4);
        dept.removeDepartment(d3);
    }
}