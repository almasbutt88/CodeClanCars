import cars.AbstractCar;

import java.util.ArrayList;

public class Customer implements IDamage {

    private double wallet;
    private ArrayList<AbstractCar>ownedCars;

    public Customer (double _wallet){
        this.wallet = _wallet;
        this.ownedCars = new ArrayList<>();
    }

    public double getWallet() {
        return wallet;
    }

    public ArrayList<AbstractCar> getOwnedCars() {
        return ownedCars;
    }

    public void buyCar(AbstractCar _car) {
        ownedCars.add(_car);
    }

    public boolean checkIfFundsAvailable(double _amount) {
        if (wallet >= _amount) {
            return true;
        }
        return false;
    }

    public void reduceFunds(double _amount) {
        wallet -= _amount;
    }

    public String damage(AbstractCar _car, double _damage) {
        _car.reducePrice(_damage);
        return "Car damaged. Price reduced to " + _car.getPrice();
    }
}
