import cars.*;
import components.Engine;
import components.Gearbox;
import components.Tyres;
import cars.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {


    Customer customer;
    PetrolCar petrolCar;
    Engine engine;
    Gearbox gearbox;
    Tyres tyres;

    @Before
    public void before(){
        customer = new Customer(50000);
        petrolCar = new PetrolCar(25000, "blue", engine, tyres, gearbox);


    }
    @Test
    public void customerHasDough(){
        assertEquals(50000, customer.getWallet(), 00);
    }
    @Test
    public void customerHasCars(){
        assertEquals(0, customer.getOwnedCars().size());
    }

    @Test
    public void hasFundsAvailableYes() {
        assertEquals(true, customer.checkIfFundsAvailable(10000));
    }

    @Test
    public void doesNotHaveFundsAvailable() {
        assertEquals(false, customer.checkIfFundsAvailable(100000));
    }

    @Test
    public void canReduceFunds() {
        customer.reduceFunds(10000);
        assertEquals(40000, customer.getWallet(), 0);
    }

    @Test
    public void damageCanBeAddedToCar(){
        customer.buyCar(petrolCar);
        customer.damage(petrolCar, 1000);
        assertEquals(24000, petrolCar.getPrice());
    }

}
