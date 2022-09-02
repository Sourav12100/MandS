package Pages;

import org.openqa.selenium.WebDriver;

public class MenuPage {
    WebDriver driver ;


    public MenuPage(WebDriver driver) {
        this.driver=driver;
    }
    public void login() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(5000);
    
    }
}


