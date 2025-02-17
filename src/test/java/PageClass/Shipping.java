package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Shipping {
    WebDriver rdriver;
    Select select;

    public Shipping(WebDriver ldriver) {
        rdriver = ldriver;

        PageFactory.initElements(rdriver, this);

    }

    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@name='company']")
    private WebElement company;

    @FindBy(xpath = "//input[@name='street[0]']")
    private WebElement address;

    @FindBy(xpath = "//input[@name='city']")
    private WebElement city;

    @FindBy(xpath = "//select[@name='region_id']")
    private WebElement state;

    @FindBy(xpath = "//input[@name='postcode']")
    private WebElement zipcode;

    @FindBy(xpath = "//select[@name='country_id']")
    private WebElement country;

    @FindBy(xpath = "//input[@name='telephone']")
    private WebElement phoneNo;

    @FindBy(xpath = "//input[@name='ko_unique_1']")
    private WebElement shippingmethod;

    @FindBy(xpath = "//span[text()='Next']")
    private WebElement Next;



    public void enterfname(){
        firstName.clear();
        firstName.sendKeys("Rohit");
    }

public void enterlname(){
        lastName.clear();
    lastName.sendKeys("Roy");
}
public void entercompany(){
        company.sendKeys("Orbex Technologies");
}
public void enterAddress(){
        address.sendKeys("New Delhi");
}
public void entercity(){
        city.sendKeys("Mayur Vihar 1");

}
public void enterState(){
        select=new Select(state);
    select.selectByValue("12");

}
public void EnterZipcode(){
        zipcode.sendKeys("25453-0985");
}

public void entercountry(){
        select=new Select(country);
        select.selectByValue("US");
}
public void enterMobNo(){
        phoneNo.sendKeys("9383577265");
}

public void clickshipping(){
        shippingmethod.click();
}

public void clicknext(){
        Next.click();
}
}




