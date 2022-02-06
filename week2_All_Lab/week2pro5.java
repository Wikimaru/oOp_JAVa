import java.util.Scanner;
public class week2pro5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int z=1;
        for(int y=0;y<num;y++)
        {
            z=y+1;
            for(int x=0;x<num*2;x++)
            {

                if(x+y>=num&&x-y<=num)
                {
                    System.out.printf("%d ",z);
                    if(x<num)
                    {
                        z--;
                    }
                    else
                    {
                        z++;
                    }
                }
                else
                {
                    System.out.printf("  ");
                }


                //System.out.printf("(%d,%d)",x,y);
            }
            System.out.printf("\n");
        }
    }
}
