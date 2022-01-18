package cars;

import components.Gearbox;
import components.Tyres;
import components.Engine;

public abstract class AbstractCar {

    protected int price;
    protected String colour;
    protected Engine engine;
    protected Tyres tyres;
    protected Gearbox gearbox;

    public AbstractCar(int price, String colour, Engine engine, Tyres tyres, Gearbox gearbox){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyres = tyres;
        this.gearbox = gearbox;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public int getPrice() {
        return price;
    }

    public void reducePrice(double damage) {
        price -= damage;
    }
    
    public void increasePrice(double _amount) {
        price += _amount;
    }
}
