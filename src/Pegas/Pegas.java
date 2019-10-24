package Pegas;

class Pegas extends Horse implements Fly
{
    public void fly()
    {
        System.out.println("Flying");
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Pegas pegas=new Pegas();
        pegas.run();
        pegas.fly();
    }
}
