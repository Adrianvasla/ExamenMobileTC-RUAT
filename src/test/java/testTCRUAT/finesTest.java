package testTCRUAT;

import activity.ruat.DataActivity;
import activity.ruat.MainActivity;
import activity.ruat.PlateActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class finesTest {

    MainActivity mainActivity = new MainActivity();
    PlateActivity plateActivity = new PlateActivity();
    DataActivity dataActivity = new DataActivity();

    @Test
    public void checkFines() throws MalformedURLException {

        mainActivity.deudaVehiculoButton.click();
        plateActivity.enterPlate.type("913BIG");
        plateActivity.sendButton.click();
        dataActivity.plusButton.click();
        dataActivity.checkFinesButton.click();

        // Verificacion

        Assert.assertTrue("Error ! the fines information wasn't displayed", dataActivity.finesLabel.isDisplayed());
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }

}
