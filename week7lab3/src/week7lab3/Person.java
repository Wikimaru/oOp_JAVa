package week7lab3;

public class Person {
    public String name;
    public String address;
    public String phoneNumber;
    public String emailAddress;

    public Person() {

    }

    @Override
    public String toString() 
    {
        return "Person{name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + "} ";
    }
}
