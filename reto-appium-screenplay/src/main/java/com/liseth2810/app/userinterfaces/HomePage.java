package com.liseth2810.app.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public final static Target BTN_MAKE_PAYMENT = Target.the("make payment button")
            .located(By.id("makePaymentButton"));
}
