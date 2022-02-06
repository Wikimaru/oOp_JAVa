import java.util.*;
import java.util.Scanner;
public class week2pro4 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String>
            list = new ArrayList<String>();
        System.out.println("input city1");
        list.add(sc.nextLine());
        System.out.println("input city2");
        list.add(sc.nextLine());
        System.out.println("input city3");
        list.add(sc.nextLine());
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        } 
    }
}
