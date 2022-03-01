package week7lab3;

public class Staff extends Employee
{
    public String title;

    public Staff() {

    }

    @Override
    public String toString() 
    {
        return super.toString() + "Staff{title=" + this.title + "} ";
    }
}
