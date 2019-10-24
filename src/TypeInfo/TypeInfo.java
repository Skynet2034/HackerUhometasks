package TypeInfo;

public class TypeInfo {
    static void info(Object i)
    {
        System.out.println("Object");
    }
    static void info(Number i)
    {
        System.out.println("Number");
    }
    static void info(String i)
    {
        System.out.println("String");
    }
    static void info(Integer i)
    {
        System.out.println("Integer");
    }
    public static void main (String[] args)
    {
        int i=100;
        info((Object)i);
        info((long)i);
        info(i);
        info(Integer.toString(i));
    }

}
