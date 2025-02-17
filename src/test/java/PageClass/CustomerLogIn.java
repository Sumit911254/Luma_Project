package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLogIn {
    WebDriver ldriver;

    public CustomerLogIn(WebDriver rdriver) {
        ldriver = rdriver;

        PageFactory.initElements(rdriver, this);

    }

    @FindBy(id = "email")
    private WebElement Email;

    @FindBy(id = "pass")
    private WebElement Password;

    @FindBy(id = "send2")
    private WebElement SiginClick;


    public void EnterEmail() {
       Email.sendKeys("rohitroy3673@gmail.com");

    }

    public void EnterPass() {
       Password.sendKeys("Rohit@123");
    }

   public void clickSigin() {
        SiginClick.click();
    }

}





