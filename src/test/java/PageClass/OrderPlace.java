package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPlace {
    WebDriver ldriver;

    public OrderPlace(WebDriver rdriver){
        ldriver=rdriver;

        PageFactory.initElements(rdriver,this);

    }
    @FindBy(xpath = "//button[@class='action primary checkout']")
    private WebElement orderplace;

   // @FindBy(xpath = "//span[text()='Continue Shopping']")
   // private WebElement continueShopping;


    public void orderdone(){
        orderplace.click();

    }
    //public void continueshopping(){
     //   continueShopping.click();

    }

//}
