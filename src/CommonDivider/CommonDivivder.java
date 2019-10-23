package CommonDivider;

public class CommonDivivder {
    static int commDiv(int a, int b)

    {

        int max=Math.max(a,b);

        int res=Math.min(a,b);

        while(max%res!=0)

        {

            int tmp=res;

            res=max%res;

            max=tmp;

        }

        return res;

    }

    public static void main (String[] args) throws java.lang.Exception

    {

        int[][] data={{60, 42},

                {30, 80},

                {100500, 206000}};

        for (int i=0; i<data.length; i++)

        {

            System.out.println("Число1="+data[i][0]+" Число2="+data[i][1]+" НОД="+commDiv(data[i][0], data[i][1]));

        }

    }
}
