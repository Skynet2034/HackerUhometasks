package Numbers;

import java.util.Arrays;
import java.util.LinkedList;


public class Numbers {
static Long[] getNumbers(long n)
{
    LinkedList<Long> res=new LinkedList<>();
    int l=Long.toString(n).length();
    long[][] memo=new long[10][l];
    //запоминаем все возможные для чисел <=n значения степеней цифр
    for (int i=1;i<10;i++)
    {
        for(int j=0;j<memo[i].length;j++)
        {
            memo[i][j]=(long)Math.pow(i,j+1);
        }
    }
   //System.out.println(Arrays.deepToString(memo));
    for (long i=1;i<=n;i++) {
        char[] temp = Long.toString(i).toCharArray();
        int length=temp.length;
        int[] digits =new int[length];
        for (int j=0;j<length;j++)
            digits[j]=Character.getNumericValue(temp[j]);//получаем массив цифр, составляющих число n
        long sum=0;
            for (int k=0;k<digits.length;k++)
        {
            int m=digits[k];
            sum+=memo[m][length-1];
        }
        if(sum==i) res.add(i);
    }
    Long [] r=new Long[res.size()];
            res.toArray(r);
    return r;
}
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        Long[] result=getNumbers(100000000);
        System.out.println(Arrays.toString(result));
        System.out.println("");
        System.out.println("memory: "+
                        (Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory())/(1024*1024)+" mb");
        long timeSpent=System.currentTimeMillis()-startTime;

        System.out.println(timeSpent+" ms");
    }
}
