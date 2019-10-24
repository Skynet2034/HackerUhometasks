package Relatives;

public class Relatives {
    public static void main (String[] args) throws java.lang.Exception
    {
        Human tryphon=new Human("Трифон", true, 88);
        Human egnat=new Human("Егнат", true, 87);
        Human dusya=new Human("Дуся", false, 86);
        Human musya=new Human("Муся", false, 85);
        Human anton=new Human("Антон", true, 40, tryphon, dusya);
        Human lena=new Human("Лена", false, 38, egnat, musya);
        Human kostya=new Human("Костя", true, 10, anton, lena);
        Human vika=new Human("Вика", false, 15, anton, lena);
        Human natasha=new Human("Наташа", false, 14, anton, lena);
        Human[] relatives={tryphon, egnat, dusya, musya, anton, lena, vika, natasha, kostya};
        for(Human i:relatives)
            System.out.println(i);
    }

}
