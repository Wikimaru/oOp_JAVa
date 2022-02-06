import java.util.Scanner;
public class week2pro3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("intput day");
        int q = sc.nextInt();
        System.out.println("intput Months");
        int m = sc.nextInt();
        System.out.println("intput year");
        int y = sc.nextInt();
        int k = y%100;
        int j = y/100;
        int h = (q+((26*(m+1))/10)+(k/4)+(j/100)+(5*j)+k)%7;
        switch(h)
        {
            case 0:System.out.println("saturday");break;
            case 1:System.out.println("sunday");break;
            case 2:System.out.println("monday");break;
            case 3:System.out.println("tuseday");break;
            case 4:System.out.println("wednesday");break;
            case 5:System.out.println("thursday");break;
            case 6:System.out.println("frifay");break;
        }
    }
}
