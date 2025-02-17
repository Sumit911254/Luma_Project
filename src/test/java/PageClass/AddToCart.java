package PageClass;

import com.github.dockerjava.core.dockerfile.DockerfileStatement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
    WebDriver ldriver;

    public AddToCart(WebDriver rdriver){
        ldriver=rdriver;


        PageFactory.initElements(rdriver,this);

    }

    @FindBy(xpath = "//div[text()='XS']")
    private WebElement Size;

    @FindBy(xpath = "//div[@id='option-label-color-93-item-56']")
    private WebElement color;

    @FindBy(xpath = "//span[text()='Add to Cart']")
    private WebElement addtokart;

    @FindBy(linkText = "shopping cart")
    private WebElement shippingcart;

    @FindBy(xpath = "//span[text()='Proceed to Checkout']")
    private WebElement checkout;


    public void selectsize(){
        Size.click();
    }
    public void selectcolor(){
        color.click();
    }
    public void AddToCart(){
        addtokart.click();
    }

    public void clickshippingcart(){
        shippingcart.click();
    }
    public void procedtocheckout(){
        checkout.click();
}
}
