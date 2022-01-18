import cars.PetrolCar;
import org.junit.Before;
import cars.DieselCar;
import components.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    private Engine engine;
    private Gearbox gearbox;
    private Tyres tyres;
    private PetrolCar petrolCar;

    @Before
    public void before() {
        engine = new Engine();
        gearbox = new Gearbox();
        tyres = new Tyres();
        petrolCar = new PetrolCar(10000, "black", engine, tyres, gearbox);
    }

    @Test
    public void hasPrice() {
        assertEquals(10000, petrolCar.getPrice());
    }

    @Test
    public void hasColour() {
        assertEquals("black", petrolCar.getColour());
    }

    @Test
    public void hasEngine() {
        assertEquals(Engine.class, petrolCar.getEngine().getClass());
    }

    @Test
    public void hasTyres() {
        assertEquals(Tyres.class, petrolCar.getTyres().getClass());
    }

    @Test
    public void hasGearbox() {
        assertEquals(Gearbox.class, petrolCar.getGearbox().getClass());
    }

}
