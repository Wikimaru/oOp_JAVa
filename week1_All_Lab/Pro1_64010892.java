import java.util.Scanner;
public class Pro1_64010892 {
    public static void main(String[] args) {
        int birth=7,death = 13,newImmigrant = 45;
        int population = 312032486;
        int a = (365*5*24*60*60);
        population += a/birth;
        population -= a/death;
        population += a/newImmigrant;
        System.out.println(population);
    }
}
