import org.example.Cars;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class CarsTest {
    public Cars cars;

    @BeforeEach
    public void init() {

       cars = new Cars("ford", "fiesta", LocalDate.of(2012, 01, 10), "silver", 25.300);
    }

    @Test
    public void verifyTheBranchOfTheCar() {
        Assertions.assertEquals("ford", cars.getBranch());


    }

    @Test
    public void verifyTheModelOfTheCar() {
        Assertions.assertEquals("fiesta", cars.getModel());


    }
    @Test
    public  void verifyTheYearOfTheCar(){
        Assertions.assertEquals(LocalDate.of(2012,01,10),cars.getYear());


    }

    @Test
    public void verifyTheColorOfTheCar() {
        Assertions.assertEquals("silver", cars.getColor());


    }

    @Test
    public void verifyThePriceOfTheCar() {
        Assertions.assertEquals(25.300, cars.getPrice());


    }
    @Test
    public void verfyTheCarIsNotNull() {
        Assertions.assertNotNull(cars);


    }
}
