import cars.*;
import components.Engine;
import components.Gearbox;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DealershipTest {

    Customer customer;
    PetrolCar petrolCar;
    Engine engine;
    Gearbox gearbox;
    Tyres tyres;
    Dealership dealership;

    @Before
    public void before(){
        customer = new Customer(30000);
        petrolCar = new PetrolCar(25000, "blue", engine, tyres, gearbox);
        dealership = new Dealership(50000);
    }

    @Test
    public void dealershipHasTill() {
        assertNotNull(dealership.getTill());
    }
    @Test
    public void dealershipHasStock(){

        assertNotNull(dealership.getStocklist());
    }

    @Test
    public void canAddCarToStock() {
        assertEquals(0, dealership.getStocklist().size());
        dealership.addCarToStocklist(petrolCar);
        assertEquals(1, dealership.getStocklist().size());
    }

    @Test
    public void canSellCar(){
        dealership.addCarToStocklist(petrolCar);

        dealership.sellCarToCustomer(customer, petrolCar);

        assertEquals(5000, customer.getWallet(),00);
        assertEquals(75000, dealership.getTill(), 0);
        assertEquals(1, customer.getOwnedCars().size());
        assertEquals(0, dealership.getStocklist().size());
    }

    @Test
    public void canRepairCar(){
        dealership.addCarToStocklist(petrolCar);

        dealership.repairCar(petrolCar, 2000);
        assertEquals(27000, petrolCar.getPrice());


    }



}
