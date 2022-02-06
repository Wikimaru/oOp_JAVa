public class week3pro1 {
    public static void main(String[] args) 
    {
        int i=1,number = 1;
        while(i<=100)
        {
            if(week3pro1.isPrime(number))
            {
                if(week3pro1.isPalindrome(number))
                {
                    if(i%10==0)
                    {
                        System.out.println(number+" ");
                        i++;
                    }
                    else
                    {
                        System.out.print(number+" ");
                        i++;
                    }
                }
            }
            number++;
        }
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
}
