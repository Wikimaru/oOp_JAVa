package javaapplication3;
import java.util.Random;

public class JavaApplication3 {

    private static double[] sort(double arr[])
    {
        int n = arr.length;
 
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    
    
    private static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
        {
            if((i+1)%10==0&&i!=0)
            {
            System.out.println(arr[i]+" ");
            }
            else
            {
            System.out.print(arr[i]+" ");
            }
        }
        System.out.println(" ");
    }
    private static void printArrayDouble(double arr[])
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if((i+1)%10==0&&i!=0)
            {
            System.out.println(String.format("%.2f",arr[i])+" ");
            }
            else
            {
            System.out.print(String.format("%.2f",arr[i])+" ");
            }
        }
        System.out.println(" ");
    }
    
    private static int[] PalindromeGen(int num)
    {
        int[] Palindrome;
        Palindrome = new int[num];
        int i=2,j=0;
        while(j<num)
        {
            if(isPalindrome(i))
            {
                if(isPrime(i))
                {
                    Palindrome[j]=i;
                    i++;j++;   
                }
            }
            i++;
        }
        return  Palindrome;
    }
    
    private static boolean isPalindrome(int number)
    {
        String str = Integer.toString(number);
        for(int i = 0; i < str.length()/2; i++) 
        {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) 
            {
                return false;
            }
        }
        return true;
    }
    
     private static boolean isPrime(int number)
    {
        int m=0,f=0;
        m=number/2;
        if(number<=1)
        {
            return false;
        }
        else
        {
            for(int i = 2 ; i<=m;i++)
            {
                if(number%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    private static double[] numberGen(int num)
    {
        Random rand = new Random();
        double[] randNum;
        randNum = new double[num];
        for(int i=0;i<num;i++)
        {
            randNum[i]=rand.nextDouble()*1000;
        }
        return  randNum;
    }
    
    public static void main(String[] args) 
    {
        StopWatch timeCounter = new StopWatch();
        int[] num;
        double[] randNum,sortNum;
        randNum = numberGen(1000);
        System.out.println("Creating a list containing 1000 elements");
        printArrayDouble(randNum);
        System.out.println("List created");
        System.out.println("Sorting stopwatch starts...");
        timeCounter.start();
        sortNum = sort(randNum);
        timeCounter.stop();
        printArrayDouble(randNum);
        System.out.println("Sorting stopwatch stoped.");
        System.out.println("The sort time is "+timeCounter.getElapsedTime()+" milliseconds");
        System.out.println("=================================================");
        //===========================//
        System.out.println("The palindromPrime stopwatch starts...");
        System.out.println("Creating 1000 PalindromPrime...");
        timeCounter.start();
        num = PalindromeGen(1000);
        timeCounter.stop();
        printArray(num);
        System.out.println("PalindromePrime created.");
        System.out.println("The palindromPrime stopwatch stoped.");
        System.out.println("The palindromPrime time is "+timeCounter.getElapsedTime()+" milliseconds");
    }
    
}
