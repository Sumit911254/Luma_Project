package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {
    WebDriver ldriver;
    Actions action;

    public SearchProduct(WebDriver rdriver){
        ldriver=rdriver;
        new Actions(rdriver);

        PageFactory.initElements(rdriver,this);
    }

    @FindBy(id = "search")
    private WebElement productsearch;

   @FindBy(xpath = "//button[@title='Search']")
   private WebElement select;

   @FindBy(linkText = "Radiant Tee")
   private WebElement productselect;

   public void serachproduct(){
       productsearch.sendKeys("T-shirt");

   }
   public void selectpro(){
      select.click();
   }

   public void selectproduct(){
       productselect.click();
   }

}
