package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US01 {
@Test
    public void test(){
    Driver.getDriver().get(ConfigReader.getProperty("url"));

    Driver.closeDriver();
}
}
