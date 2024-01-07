import org.testng.annotations.DataProvider;

public class TC9_CustomDataProvider {

    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData()
    {
        Object[][] data = {  {"abc@gmail.com","abc"},{"mno@gmail.com","mno"},{"xyz@gmail.com","xyz"}};
        return data;
    }

}
