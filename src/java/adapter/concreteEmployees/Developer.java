package adapter.concreteEmployees;

import adapter.Employee;

public class Developer implements Employee {
    @Override
    public void doWork() {
        System.out.println("Doing the programmer's job right now... writing code...");
    }
}
