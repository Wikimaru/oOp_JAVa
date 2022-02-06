import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class week3pro3 {
    public static void main(String[] args) 
    {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] matrix;
        matrix = new int[size][size];
        for(int y=0;y<size;y++)
        {
            for(int x=0;x<size;x++)
            {
                matrix[x][y] = rand.nextInt(2);
            }
        }
        for(int y=0;y<size;y++)
        {
            for(int x=0;x<size;x++)
            {
                System.out.print(matrix[x][y]);
            }
            System.out.println(" ");
        }
        Allrow(size, matrix);
        Allcolum(size,matrix);
        superdiagonal(size, matrix);
        Alldiagonal(size, matrix);
        subdiagonal(size, matrix);
    }
    private static void Allrow(int size,int[][] matrix)
    {
        boolean isWork = false;
        for(int y=0;y<size;y++)
        {
            boolean isAll = true;
            for(int x=0;x<size;x++)
            {
                if(matrix[y][y]!=matrix[x][y])
                {
                    isAll = false;
                }
            }
            if(isAll)
            {
                System.out.println("All "+ matrix[y][y]+" on a row "+ (y+1));
                isWork = true;
            }
        }
        if(!isWork)
        {
            System.out.println("No same numbers on the row");
        }
    }
    private static void Allcolum(int size,int[][] matrix)
    {
        boolean isWork = false;
        for(int x=0;x<size;x++)
        {
            boolean isAll = true;
            for(int y=0;y<size;y++)
            {
                if(matrix[x][x]!=matrix[x][y])
                {
                    isAll = false;
                }
            }
            if(isAll)
            {
                System.out.println("All "+ matrix[x][x]+" on a colum"+ (x+1));
                isWork = true;
            }
        }
        if(!isWork)
        {
            System.out.println("No same numbers on the colum");
        }
    }
    private static void superdiagonal(int size,int[][] matrix)
    {
        boolean isWork = false;
        boolean isAll= true;
        for(int x=0;x<size-1;x++)
        {
            if(matrix[1][0]!=matrix[x+1][x])
            {
                isAll = false;
            }
        }
        if(isAll)
        {
            System.out.println("All "+ matrix[1][0]+" on a superdiagonal");
            isWork = true;
        }
        if(!isWork)
        {
            System.out.println("No same numbers on the superdiagonal");
        }
    }
    private static void Alldiagonal(int size,int[][] matrix)
    {
        boolean isWork = false;
        boolean isAll= true;
        for(int x=0;x<size;x++)
        {
            if(matrix[0][0]!=matrix[x][x])
            {
                isAll = false;
            }
        }
        if(isAll)
        {
            System.out.println("All "+ matrix[0][0]+" on a diagonal");
            isWork = true;
        }
        if(!isWork)
        {
            System.out.println("No same numbers on the diagonal");
        }

    }
    private static void subdiagonal(int size,int[][] matrix)
    {
        boolean isWork = false;
        boolean isAll= true;
        for(int x=0;x<size-1;x++)
        {
            if(matrix[0][1]!=matrix[x][x+1])
            {
                isAll = false;
            }
        }
        if(isAll)
        {
            System.out.println("All "+ matrix[0][1]+" on a subdiagonal");
            isWork = true;
        }
        if(!isWork)
        {
            System.out.println("No same numbers on the subdiagonal");
        }
    }
}
