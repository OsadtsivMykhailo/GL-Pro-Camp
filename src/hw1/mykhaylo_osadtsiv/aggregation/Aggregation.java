package hw1.mykhaylo_osadtsiv.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Aggregation {
    public static void main(String[] args) {
        Person p1 = new Person("MikeLazovsky1");
        Person p2 = new Person("MikeLazovsky2");
        Person p3 = new Person("MikeLazovsky3");
        Person p4 = new Person("MikeLazovsky4");
        List<Person> employees = new ArrayList<>();
        employees.add(p1);
        employees.add(p2);
        employees.add(p3);
        employees.add(p4);
        System.out.println(p1);
        Organization monsterInc = new Organization(employees);
        System.out.println(monsterInc);
    }
}
