package PetrolStation;

public class Cashbox {
    private static Float PRICE_OF_95_GAS = 45.0f;

    private static Float PRICE_OF_98_GAS = 50.0f;
    private static float price(TypeOfGas gasType)
    {
        float price=0;
        if (gasType == TypeOfGas.GAS_95) {

            price= PRICE_OF_95_GAS;

        }

        if (gasType == TypeOfGas.GAS_98) {

            price= PRICE_OF_98_GAS;

        }
        return price;
    }
    private static void refund(float amount)
    {
        System.out.println(amount+" возвращено");
    }

    public static void fillUp(Car car){
        float gasPrice=price(car.getTypeOfGas());
        float litters=car.getMoney()/gasPrice;
        if ((car.getCurrentQuantityOfGas()+litters)>car.gasCapacity) {
            litters = car.gasCapacity - car.getCurrentQuantityOfGas();
            float changeAmount = car.getMoney() - litters * gasPrice;
            refund(changeAmount);
        }
        Dispenser.fillUp(new Order(car.getTypeOfGas(), litters), car);


    }
}
