package week7lab3;

import java.time.LocalDate;

public class Employee extends Person
{
    public String office;
    public double salary;
    public LocalDate dateHired;

    public Employee() {}

    @Override
    public String toString() {
        return super.toString() + "Employee{office=" + this.office + ", salary=" + this.salary + ", dateHired=" + this.dateHired + "} ";
    }
}
