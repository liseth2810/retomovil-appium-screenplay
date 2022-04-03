package com.liseth2810.app.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage  {

    public final static Target USERNAME = Target.the("username field")
            .located(By.id("usernameTextField"));
    public final static Target PASSWORD = Target.the("password field")
            .located(By.id("passwordTextField"));
    public final static Target BTN_LOGIN = Target.the("login button")
            .located(By.id("loginButton"));
}
