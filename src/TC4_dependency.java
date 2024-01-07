import org.testng.Assert;
import org.testng.annotations.Test;

public class TC4_dependency {

    @Test
    void startCar(){
        System.out.println("Car started");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("Car driver");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar(){
        System.out.println("Car stopped");
    }

    @Test(dependsOnMethods = {"driveCar","stopCar"}, alwaysRun = true)
    void parkCar(){
        System.out.println("Car parked");
    }

}
