package structural.adapter.concreteEmployees;

import structural.adapter.Employee;

public class Security implements Employee {
    @Override
    public void doWork() {
        System.out.println("Doing the security's job right now...(actually, do nothing)");
    }
}
