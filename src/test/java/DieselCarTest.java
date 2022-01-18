import org.junit.Before;
import cars.DieselCar;
import components.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DieselCarTest {

    private Engine engine;
    private Gearbox gearbox;
    private Tyres tyres;
    private DieselCar dieselCar;

    @Before
    public void before() {
        engine = new Engine();
        gearbox = new Gearbox();
        tyres = new Tyres();
        dieselCar = new DieselCar(10000, "black", engine, tyres, gearbox);
    }

    @Test
    public void hasPrice() {
        assertEquals(10000, dieselCar.getPrice());
    }

    @Test
    public void hasColour() {
        assertEquals("black", dieselCar.getColour());
    }

    @Test
    public void hasEngine() {
        assertEquals(Engine.class, dieselCar.getEngine().getClass());
    }

    @Test
    public void hasTyres() {
        assertEquals(Tyres.class, dieselCar.getTyres().getClass());
    }

    @Test
    public void hasGearbox() {
        assertEquals(Gearbox.class, dieselCar.getGearbox().getClass());
    }

}
