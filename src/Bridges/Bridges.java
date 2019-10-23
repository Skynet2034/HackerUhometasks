package Bridges;

public class Bridges {
    public static void main(String[] args) {
        WaterBridge waterBridge=new WaterBridge();
        SuspensionBridge suspensionBridge=new SuspensionBridge();
        System.out.println("Максмальное количество транспорта для Подвесного моста="+suspensionBridge.getMaxTransportCount());
        System.out.println("Максмальное количество транспорта для Водного моста="+waterBridge.getMaxTransportCount());

    }
}
