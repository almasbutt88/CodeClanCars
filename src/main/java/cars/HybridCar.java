package cars;

import components.Engine;
import components.Gearbox;
import components.Tyres;

public class HybridCar extends AbstractCar {

    public HybridCar(int price, String colour, Engine engine, Tyres tyres, Gearbox gearbox) {
        super(price, colour, engine, tyres, gearbox);
    }
}
