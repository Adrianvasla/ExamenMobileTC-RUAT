package activity.ruat;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class PlateActivity {

    public TextBox enterPlate;
    public Button sendButton;

    public PlateActivity() {

        enterPlate = new TextBox(By.className("android.widget.EditText"));
        sendButton = new Button(By.xpath("//android.widget.Button[@text='close send']"));


    }
}
