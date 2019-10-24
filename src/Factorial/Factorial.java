package Factorial;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger factorial(int num)
    {
        BigInteger res=new BigInteger("1");
        for (int i=1;i<=num;i++)
        {
            res=res.multiply(new BigInteger(new Integer(i).toString()));
        }
        return res;
    }
    public static void main (String[] args)
    {
        int[] data={10, 30, 50};
        for (int i:data)
            System.out.println(i+"! = "+factorial(i));
    }

}
