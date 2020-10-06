package deviceFactory;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Android implements IDevice {

    @Override
    public AppiumDriver create() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "AVL Mi MIX 3");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("appPackage", "bo.gob.ruat.ruatmovil");
        capabilities.setCapability("appActivity", "bo.gob.ruat.ruatmovil.MainActivity");
        capabilities.setCapability("platformName", "Android");

        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        return driver;
    }
}