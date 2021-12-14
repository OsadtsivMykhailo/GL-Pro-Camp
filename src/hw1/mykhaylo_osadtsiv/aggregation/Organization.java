package hw1.mykhaylo_osadtsiv.aggregation;

import java.util.List;

public class Organization {


    private List employees;

    public Organization(List employees) {
        this.employees = employees;
    }

    public List getEmployees() {
        return employees;
    }

    public void setEmployees(List employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "employees=" + getEmployees() +
                '}';
    }
}
