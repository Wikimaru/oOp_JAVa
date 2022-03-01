package week7lab3;

public class Faculty extends Employee
{
    public double officeHours;
    public String rank;

    public Faculty() {}

    @Override
    public String toString() 
    {
        return super.toString() + "Faculty{office hours=" + this.officeHours + ", rank=" + this.rank + "} ";
    }
}
