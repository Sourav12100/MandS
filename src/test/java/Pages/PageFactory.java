package Pages;

import org.openqa.selenium.WebDriver;

import java.awt.*;

public class PageFactory {
   WebDriver driver;

    private MenuPage MenuPage;
    private MenuBar menu;


    public PageFactory(MenuPage MenuPage) {
        this.MenuPage=MenuPage;
    }

    public PageFactory(MenuBar menu) {
        this.menu = menu;
    }
    public PageFactory(WebDriver driver){
        this.driver=driver;
    }


}
