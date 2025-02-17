package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

    WebDriver ldriver;

    public IndexPage(WebDriver rdriver) {
        ldriver = rdriver;

        PageFactory.initElements(rdriver, this);

    }


    @FindBy(linkText = "Create an Account")
    private WebElement createacc;

    @FindBy(linkText = "Sign In")
    private WebElement SignIn;

    @FindBy(xpath = "//a[@class='action create primary']")
    private WebElement createAnaccount;


    public void createacc() {
        createacc.click();

    }

    public void sinin() {
        SignIn.click();

    }

    public void clickaccount() {
        createAnaccount.click();
    }
}
