import cars.AbstractCar;

import java.util.ArrayList;

public class Dealership {

    private int till;
    private ArrayList<AbstractCar> stocklist;

    public Dealership(int till) {
        this.till = till;
        this.stocklist = new ArrayList<>();
    }

    public int getTill() {
        return till;
    }

    public ArrayList<AbstractCar> getStocklist() {
        return stocklist;
    }

    public void addCarToStocklist(AbstractCar _car) {
        stocklist.add(_car);
    }

    public void addFundsToTill(double _amount) {
        till += _amount;
    }

    public String sellCarToCustomer(Customer _customer, AbstractCar _car) {
        if (stocklist.contains(_car) && _customer.checkIfFundsAvailable(_car.getPrice())) {
            _customer.reduceFunds(_car.getPrice());
            addFundsToTill(_car.getPrice());
            stocklist.remove(_car);
            _customer.buyCar(_car);
            return "Car sold";
        }
        return "Unable to sell car - either not in stocklist or customer has insufficient funds";
    }
    
    public String repairCar(AbstractCar _car, double damage){
        _car.increasePrice(damage);
        till -= damage;
        return "Car has been repaired and it cost " + damage + "amount of dough";
    }
}
