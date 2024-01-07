import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC8_DataProvider {

    @Test(dataProvider = "LoginDataProvider",dataProviderClass = TC9_CustomDataProvider.class)
    void loginTest(String email,String password){
        System.out.println(email + "   " + password);
    }

}
