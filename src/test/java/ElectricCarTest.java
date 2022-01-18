import cars.AbstractCar;
import cars.ElectricCar;
import components.Gearbox;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import components.Engine;
import components.Tyres;

public class ElectricCarTest {

    Engine engine;
    Tyres tyres;
    Gearbox gearbox;
    ElectricCar electricCar;

    @Before
    public void before() {

        engine = new Engine();
        tyres = new Tyres();
        gearbox = new Gearbox();
        electricCar = new ElectricCar(35000, "black", engine, tyres, gearbox);

    }

    @Test

    public void hasPrice(){
        assertEquals(35000, electricCar.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals("black", electricCar.getColour());
    }

    @Test
    public void hasEngine(){
        assertEquals(true, electricCar.getEngine() instanceof Engine);
    }

    @Test
    public void hasGearBox(){
        assertEquals(true, electricCar.getGearbox() instanceof Gearbox);
    }



}
