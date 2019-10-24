package Numbers;

import java.util.TreeSet;

public class Numbers {
static TreeSet<Long> getNumbers(long n)
{
    TreeSet<Long> res=new TreeSet<>();
    for (long i=0;i<n;i++) {
        char[] temp = Long.toString(i).toCharArray();
        int length=temp.length;
        int[] digits =new int[length];
        for (int j=0;j<length;j++)
            digits[j]=Character.getNumericValue(temp[j]);//получаем массив цифр, составляющих число n
        long sum=0;
        for (int k=0;k<length;k++)
        {
            sum+=Math.pow(digits[k],length);
        }
        if(sum==i) res.add(i);
    }
    return res;
}
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        TreeSet<Long> result=getNumbers(100000000);
        System.out.println(result);
        System.out.println("");
        System.out.println("memory: "+
                        (Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory())/(1024*1024)+" mb");
        long timeSpent=System.currentTimeMillis()-startTime;
        System.out.println(timeSpent+" ms");
    }
}
