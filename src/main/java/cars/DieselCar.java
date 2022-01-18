package cars;

import components.Engine;
import components.Gearbox;
import components.Tyres;

public class DieselCar extends AbstractCar {

    public DieselCar(int price, String colour, Engine engine, Tyres tyres, Gearbox gearbox) {
        super(price, colour, engine, tyres, gearbox);
    }
}
