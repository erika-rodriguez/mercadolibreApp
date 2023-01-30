package com.TrainingCycleSolvdArg.carina.demo.mobile.gui.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

public  abstract class ProductScreenBase extends AbstractPage implements IMobileUtils {

    public ProductScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickOnTheFirstProduct();

   public abstract void swipeUp();

   public abstract AddedProductScreenBase clickOnAgregarAlCarrito();

   public abstract BuyNowScreenBase clickOnBuyNow();
   public abstract AddedProductScreenBase clickOnAddToCart();

    public abstract PaymentOptionsScreenBase clickOnViewPaymentOptionsBtn();

    public abstract ShippingOptionsScreenBase clickOnViewShippingOptionsBtn();
}
