package TestClass;

import PageClass.*;
import org.testng.annotations.Test;

import java.time.Duration;

public class TastCase extends BaseClass {

    @Test(enabled = false)
    public void RegistrationAndLogin() {

        IndexPage ip = new IndexPage(driver);

        ip.sinin();
      //  ip.clickaccount();

        CustomerLogIn cl = new CustomerLogIn(driver);
        cl.EnterEmail();
        cl.EnterPass();
        cl.clickSigin();

        SearchProduct sp = new SearchProduct(driver);
        sp.serachproduct();
        sp.selectpro();

    }

    @Test
    public void CreateAccount() {
        IndexPage ip = new IndexPage(driver);

       // ip.sinin();
        ip.createacc();
     //  ip.clickaccount();


        CreateNewCustomerAccount createaccount = new CreateNewCustomerAccount(driver);
        createaccount.enterfirstname();
        createaccount.enterlastname();
        createaccount.enteremail();
        createaccount.password();
        createaccount.repassword();
        createaccount.clickaccount();

        SearchProduct sp = new SearchProduct(driver);
        sp.serachproduct();
        sp.selectpro();
        sp.selectproduct();

        AddToCart ac = new AddToCart(driver);
        ac.selectsize();
        ac.selectcolor();
        ac.AddToCart();
        ac.clickshippingcart();
        ac.procedtocheckout();

        Shipping sh = new Shipping(driver);
        sh.enterfname();
        sh.enterlname();
        sh.entercompany();
        sh.enterAddress();
        sh.entercity();
        sh.enterState();
        sh.EnterZipcode();
        sh.entercountry();
        sh.enterMobNo();
        sh.clickshipping();
        sh.clicknext();

        OrderPlace op=new OrderPlace(driver);
       // op.orderdone();
      //  op.continueshopping();

    }
}



