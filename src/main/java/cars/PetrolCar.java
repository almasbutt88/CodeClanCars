package cars;

import components.Engine;
import components.Gearbox;
import components.Tyres;

public class PetrolCar extends AbstractCar{

    public PetrolCar(int price, String colour, Engine engine, Tyres tyres, Gearbox gearbox) {
        super(price, colour, engine, tyres, gearbox);
    }
}
