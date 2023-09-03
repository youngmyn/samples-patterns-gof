package structural.adapter.concreteEmployees;

import structural.adapter.Employee;

public class Courier implements Employee {
    @Override
    public void doWork() {
        System.out.println("Doing the courier's job right now...");
    }
}
