import java.util.Random;
import java.util.Scanner;
public class week2pro2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("scissor (0), rock (1), paper (2)");
        int num = sc.nextInt(3);
        int com = rand.nextInt(3);
        if(num<0||num>2)
        {
            System.out.println("error");
            System.exit(0);
        }
        switch(com)
        {
            case 0:
                System.out.println("The computer is scissor");break;
            case 1:
                System.out.println("The computer is rock");break;
            case 2:
                System.out.println("The computer is paper");break;
        }
        if(num == com)
        {
            System.out.println("Draw");
            System.exit(0);
        }
        switch(num)
        {
            case 0:
                if(com == 1)
                {
                    System.out.println("you loses");
                }
                else
                {
                    System.out.println("you won");
                }
                break;
            case 1:
                if(com == 2)
                {
                    System.out.println("you loses");
                }
                else
                {
                    System.out.println("you won");
                }
                break;

            case 2:
                if(com == 0)
                {
                    System.out.println("you loses");
                }
                else
                {
                    System.out.println("you won");
                }
                break;
            default:
                break;
        }
        
    }
}
