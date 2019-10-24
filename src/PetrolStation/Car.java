package PetrolStation;

public class Car {
    private Integer money;
    private TypeOfGas typeOfGas;
    private Float currentQuantityOfGas;
    public final float gasCapacity = 20.0F;

    public Car(Integer money, TypeOfGas typeOfGas, Float currentQuantityOfGas) {
        this.money = money;
        this.typeOfGas = typeOfGas;
        this.currentQuantityOfGas = currentQuantityOfGas;
    }

    public Integer getMoney() {
        return this.money;
    }

    public TypeOfGas getTypeOfGas() {
        return this.typeOfGas;
    }

    public Float getCurrentQuantityOfGas() {
        return this.currentQuantityOfGas;
    }

    public void addGas(Float quantityOfGas) {
        this.currentQuantityOfGas = this.currentQuantityOfGas + quantityOfGas;
    }
}
