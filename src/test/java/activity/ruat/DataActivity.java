package activity.ruat;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class DataActivity {

    public Button plusButton;
    public Button checkFinesButton;
    public Label finesLabel;

    public DataActivity() {

        plusButton = new Button(By.xpath("//android.widget.Button[@text='close add']"));
        checkFinesButton = new Button(By.xpath("//android.widget.Button[@text='document Infracciones e ITV']"));
        finesLabel = new Label(By.xpath("//android.view.View[@text='DATOS DEUDAS INFRACCIONES E ITV']"));

    }

}
