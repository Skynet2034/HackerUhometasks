package Computer;

public class Computer {
    private Mouse mouse;
    private Keyboard keyboard;
    private Monitor monitor;
    Computer()
    {
        mouse=new Mouse();
        keyboard=new Keyboard();
        monitor=new Monitor();
    }

    public Mouse getMouse()
    {
        return mouse;
    }
    public Keyboard getKeyboard()
    {
        return keyboard;
    }
    public Monitor getMonitor()
    {
        return monitor;
    }
    public static void main (String[] args)
    {
        Computer comp=new Computer();
        System.out.println(comp.getKeyboard().getName());
        System.out.println(comp.getMouse().getName());
        System.out.println(comp.getMonitor().getName());
    }

}
