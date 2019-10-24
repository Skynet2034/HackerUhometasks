package PetrolStation;

public class Dispenser {
    private static boolean isOccupied;

    public static void fillUp(Order order, Car car) {
        if (isOccupied) {

            System.out.println("Подождите, пока колонка освободится");

        } else {
            isOccupied=true;
            car.addGas(order.litters);

            System.out.println("Заправлено " + order.litters);
            isOccupied=false;


        }
    }
}
