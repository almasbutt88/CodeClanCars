package cars;

import components.Engine;
import components.Gearbox;
import components.Tyres;

public class ElectricCar extends AbstractCar {

    public ElectricCar(int price, String colour, Engine engine, Tyres tyres, Gearbox gearbox) {
        super(price, colour, engine, tyres, gearbox);
    }
}
