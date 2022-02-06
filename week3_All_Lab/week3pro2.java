import java.util.Arrays;
import java.util.Scanner;
public class week3pro2 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String inputStr;
        inputStr = sc.nextLine();
        int[] list1 = StrToIntList(inputStr);
        inputStr = sc.nextLine();
        int[] list2 = StrToIntList(inputStr);
        int[] lastList;
        lastList = new int[list1.length+list2.length];
        lastList = merge(list1, list2);
        for(int i=0;i<lastList.length;i++)
        {
            System.out.print(lastList[i]+" ");
        }
    }
    private static int[] StrToIntList(String StrIn)
    {
        String str[] = StrIn.split(" ");
        int[] intList;
        intList = new int[str.length];
        for(int i=0;i<str.length;i++)
        {
            intList[i] = Integer.parseInt(str[i]);   
        }
        return intList;
    }
    private static int[] merge(int[] list1, int[] list2)
    {
        int l =0,j=0;
        l = list1.length+list2.length;
        int[] listFinal;
        listFinal = new int[l];
        System.arraycopy(list1, 0, listFinal, 0, list1.length);
        System.arraycopy(list2, 0, listFinal, list1.length, list2.length);
        Arrays.sort(listFinal);
        return listFinal;
    }
}
