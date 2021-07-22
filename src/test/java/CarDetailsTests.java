import carStuff.Car;
import carStuff.CarUtils;
import org.junit.Assert;
import org.junit.Test;

public class CarDetailsTests {

    @Test
    public void getCarDetails_GivenValidCar_ReturnExpectedString(){

        //Arrange
        Car car = new Car();
        car.setColor("Blue");
        car.setMake("Ford");
        car.setModel("Mustang");
        car.setYear("2019");

        //Act
        String details = CarUtils.getCarDetails(car);

        //Assert
        Assert.assertEquals("Blue 2019 Ford Mustang", details);



    }

    @Test
    public void getCarMileage_GivenValidMileage(){
        Car car = new Car();
        car.setMileage(2000.65);

        Double CarMileage = CarUtils.addToMileage(car, 4000.10);

        Assert.assertEquals(6000.75, CarMileage, 0.0001 );
    }

    @Test
    public void isCarEletricTrue(){
        Car car = new Car();

        CarUtils.convertToElectric(car, "electric");

        Assert.assertTrue("True", car.getIsElectric());



    }

}
