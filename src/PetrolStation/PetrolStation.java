package PetrolStation;
// вариант со * - выдача сдачи
public class PetrolStation {
    public void makeService() {

        Car car = new Car(200, TypeOfGas.GAS_98, 18.0f);


        Cashbox.fillUp(car);

        System.out.println();

    }

    public static void main(String[] args) {

        PetrolStation petrolStation = new PetrolStation();

        petrolStation.makeService();

    }

}
