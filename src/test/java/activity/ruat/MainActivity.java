package activity.ruat;

import appiumControl.Button;
import org.openqa.selenium.By;


public class MainActivity {

    public Button deudaVehiculoButton;

    public MainActivity(){

        deudaVehiculoButton = new Button(By.xpath("//android.view.View[contains(@content-desc,'Deuda Veh')]"));
    }

}
