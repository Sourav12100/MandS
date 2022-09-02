package Test;

import Pages.PageFactory;

public class LoginTest extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        setup();
        pageFactory.MenuBAr().login();
        pageFactory.Menuabr().menu();
    }
    public void MenuBar(){
        driver.MenuBAr();
    }
}

