import cars.AbstractCar;
import cars.ElectricCar;
import cars.HybridCar;
import components.Gearbox;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import components.Engine;
import components.Tyres;

public class HybridCarTest {

    Engine engine;
    Tyres tyres;
    Gearbox gearbox;
    HybridCar hybridCar;

    @Before
    public void before() {

        engine = new Engine();
        tyres = new Tyres();
        gearbox = new Gearbox();
        hybridCar = new HybridCar(30000, "silver", engine, tyres, gearbox);

    }

    @Test

    public void hasPrice(){
        assertEquals(30000, hybridCar.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals("silver", hybridCar.getColour());
    }

    @Test
    public void hasEngine(){
        assertEquals(true, hybridCar.getEngine() instanceof Engine);
    }

    @Test
    public void hasGearBox(){
        assertEquals(true, hybridCar.getGearbox() instanceof Gearbox);
    }



}
