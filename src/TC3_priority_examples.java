import org.testng.annotations.Test;

public class TC3_priority_examples {

    @Test(priority = 0)
    void testOne(){
        System.out.println("This is test1");
    }

    @Test(priority = 1)
    void testTwo(){
        System.out.println("This is test2");
    }

    @Test(priority = 2)
    void testThree(){
        System.out.println("This is test3");
    }

    @Test(priority = 3,enabled = false)
    void testFour(){
        System.out.println("This is test4");
    }

}
