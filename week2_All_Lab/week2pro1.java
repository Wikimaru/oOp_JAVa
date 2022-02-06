import java.util.Scanner;
public class week2pro1 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("input Day number");
        int day = sc.nextInt();
        System.out.println("input days elapsed");
        int esday = sc.nextInt();
        day = day%7;
        switch(day)
        {
            case 0:System.out.println("today is sunday");break;
            case 1:System.out.println("today is monday");break;
            case 2:System.out.println("today is tuseday");break;
            case 3:System.out.println("today is wednesday");break;
            case 4:System.out.println("today is thursday");break;
            case 5:System.out.println("today is friday");break;
            case 6:System.out.println("today is saturday");break;
        }
        day = (day+esday)%7;
        switch(day)
        {
            case 0:System.out.println("and the future day is sunday");break;
            case 1:System.out.println("and the future day is monday");break;
            case 2:System.out.println("and the future day is tuseday");break;
            case 3:System.out.println("and the future day is wednesday");break;
            case 4:System.out.println("and the future day is thursday");break;
            case 5:System.out.println("and the future day is friday");break;
            case 6:System.out.println("and the future day is saturday");break;
        }

    }
    
}
