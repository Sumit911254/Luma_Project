package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomerAccount {
    WebDriver ldriver;

    public CreateNewCustomerAccount(WebDriver rdriver) {
        ldriver = rdriver;

        PageFactory.initElements(rdriver, this);


    }


    @FindBy(id = "firstname")
    private WebElement firstname;

    @FindBy(id = "lastname")
    private WebElement lastname;

    @FindBy(id = "email_address")
    private WebElement emailaddress;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "password-confirmation")
    private WebElement confirmpass;

    @FindBy(xpath = "//button[@title='Create an Account']")
    private WebElement createaccount;



    public void enterfirstname() {
        firstname.sendKeys("Rohit");

    }

    public void enterlastname() {
        lastname.sendKeys("Roy");
    }

    public void enteremail() {
        emailaddress.sendKeys("Ruottrtah867495@gamil.com");

    }

    public void password() {
        password.sendKeys("demo@2001");
    }

    public void repassword() {
        confirmpass.sendKeys("demo@2001");
    }

    public void clickaccount() {
        createaccount.click();

    }
}
